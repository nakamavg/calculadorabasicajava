# Archivo: src/CMakeLists.txt

# Añadir todos los archivos fuente
file(GLOB_RECURSE SOURCES "${CMAKE_CURRENT_SOURCE_DIR}/calculadora/*.java")

# Imprimir los archivos fuente encontrados
message("Archivos fuente encontrados: ${SOURCES}")

# Crear el directorio de salida
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)
file(MAKE_DIRECTORY ${CMAKE_RUNTIME_OUTPUT_DIRECTORY})

# Compilar los archivos Java
add_custom_command(
	OUTPUT ${CMAKE_RUNTIME_OUTPUT_DIRECTORY}/calculadora/Main.class
	COMMAND javac -d ${CMAKE_RUNTIME_OUTPUT_DIRECTORY} ${SOURCES}
	DEPENDS ${SOURCES}
	COMMENT "Compilando archivos Java"
)

# Añadir el ejecutable
add_custom_target(Calculadora ALL
	DEPENDS ${CMAKE_RUNTIME_OUTPUT_DIRECTORY}/calculadora/Main.class
)