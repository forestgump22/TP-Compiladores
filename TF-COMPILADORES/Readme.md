# Instrucciones

Si tiene menos de 12 GB de RAM, cierre todas las aplicaciones (chrome/vscode)
y baje el -j a 2 o 1, demorará mas pero no debería fallar.

Para crear la imagen, ejecute el siguiente comando una **sola vez**

    docker build -t compilers .

Para crear el contenedor, ejecute el siguiente comando una **sola vez**

    docker run --name llvm_btw -it compilers

Para salir del contenedor poner ctrl+D, esto detiene el contenedor.

Para usarlo posteriormente, hay que reiniciarlo en modo iteractivo

Para levantar el contenedor para subsiguientes sesiones usar el comando:

    docker start -ai llvm_btw

Visual Studio Code funciona muy bien para trabajar con un contenedor docker,
instale los correspondientes addons para conectar a un contenedor docker.

[Un videito](https://www.youtube.com/watch?v=X7guekGZM20)
