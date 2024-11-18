FROM archlinux:base-devel

WORKDIR /compilers


# copy some stuff

COPY calc/ calc/
COPY .bashrc /root/


# updating system and installing packages

RUN pacman -Syu --noconfirm \
  && pacman -S --noconfirm git clang cmake python jdk-openjdk antlr4 antlr4-runtime \
  && pacman -Scc --noconfirm


# download and compile llvm >_<

RUN git clone --depth 1 https://github.com/llvm/llvm-project.git \
  && cmake -S llvm-project/llvm -B llvm-project/build \
  -G "Unix Makefiles" \
  -DLLVM_ENABLE_PROJECTS="" \
  -DCMAKE_BUILD_TYPE=Release \
  -DLLVM_PARALLEL_COMPILE_JOBS=8 \
  && cmake --build llvm-project/build -j 8 \
  && cmake --install llvm-project/build \
  && rm -rf llvm-project

