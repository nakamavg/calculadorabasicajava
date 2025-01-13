cmake_minimum_required(VERSION 3.10)
project(Calculadora)

# Establecer el directorio de salida para los archivos compilados
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)

# Añadir el directorio de origen
add_subdirectory(src)