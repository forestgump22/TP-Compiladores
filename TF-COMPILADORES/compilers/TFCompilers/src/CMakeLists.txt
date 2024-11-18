# requiere cmake version 3.30 o superior
cmake_minimum_required(VERSION 3.30)

# define el nombre del proyecto como -> prog
project(prog)

# Based on this link
# https://github.com/antlr/antlr4/discussions/4418

# establece la etiqueta de la version de antlr4 a usar
set(ANTLR_TAG "4.13.2")

# configuracion de las rutas para antlr4 cuando se ejecuta en un entorno Docker
set(CMAKE_MODULE_PATH "/compilers/antlr4/cmake/")
set(ANTLR_EXECUTABLE "/usr/share/java/antlr-${ANTLR_TAG}-complete.jar")
set(PROG_INCLUDE_DIR "/usr/include/antlr4-runtime/")
set(PROG_LIB_DIR "/usr/lib/")

# alternativa para configuracion de ANTLR en un entorno local
# set(CMAKE_MODULE_PATH "/home/lmcs/Documents/git/antlr4/runtime/Cpp/cmake/")
# set(ANTLR_EXECUTABLE "/home/lmcs/Apps/antlr-${ANTLR_TAG}-complete.jar")
# set(PROG_INCLUDE_DIR "/home/lmcs/Apps/antlr4-cpp/include/antlr4-runtime")
# set(PROG_LIB_DIR "/home/lmcs/Apps/antlr4-cpp/lib")

# verifica si el ejecutable de antlr4 existe, si no, generara un error
if(NOT EXISTS "${ANTLR_EXECUTABLE}")
  message(FATAL_ERROR "Couldn't find: ${ANTLR_EXECUTABLE}")
endif()
find_package(ANTLR) # busca el archivo findANTLR.cmake

# imprime la version de antlr4 encontrada y el directorio de salida
message(STATUS "Found ANTLR: ${ANTLR_VERSION}")
message(STATUS "ANTLR generated sources dir: ${ANTLR_Calc_OUTPUT_DIR}")

# busca el paquete llvm como dependencia necesaria para el proyecto
find_package(LLVM REQUIRED CONFIG)

# imprime la version de llvm encontrada y el directorio de configuracion utilizado
message(STATUS "Found LLVM ${LLVM_PACKAGE_VERSION}")
message(STATUS "Using LLVMConfig.cmake in: ${LLVM_DIR}")

# busca todos los archivos de codigo fuente c++(.cpp) y de gramatica antlr4(.g4)
file(GLOB SOURCES "*.cpp")
file(GLOB GFOURS "*.g4")

# genera los archivos necesarios de antlr4(lexer,parser y visitor) para el archivo de gramatica Calc
antlr_target(Calc ${GFOURS} LEXER PARSER VISITOR)

# mapea los componentes de llvm necesarios para el proyecto a bibliotecas
llvm_map_components_to_libnames(
  llvm_libs
    core
    executionengine
    object
    orcjit
    support
    targetparser
    native
)

# crea un ejecutable con el nombre del proyecto, incluyendo los archivos fuente y las salidas de antlr4
add_executable(${PROJECT_NAME} ${SOURCES} ${ANTLR_Calc_CXX_OUTPUTS})

# establece los directorios de enlace privados para las bibliotecas del proyecto
target_link_directories(${PROJECT_NAME} PRIVATE ${PROG_LIB_DIR})

# vincula las bibliotecas necesarias incluyendo el runtime de antlr4 y las bibliotecas de llvm
target_link_libraries(${PROJECT_NAME} PRIVATE antlr4-runtime ${llvm_libs})

# establece los directorios de inclusion privados para las dependencias
target_include_directories(
  ${PROJECT_NAME} PRIVATE
  ${PROG_INCLUDE_DIR}
  ${ANTLR_Calc_OUTPUT_DIR}
  ${LLVM_INCLUDE_DIRS}
)

# agrega definiciones necesarias para compilar con llvm
add_definitions(${LLVM_DEFINITIONS})

# establece que se requiere c++ 20 para la compilacion del proyecto
target_compile_features(${PROJECT_NAME} PRIVATE cxx_std_20)

# exporta los comandos de compilacion
set(CMAKE_EXPORT_COMPILE_COMMANDS ON)
#