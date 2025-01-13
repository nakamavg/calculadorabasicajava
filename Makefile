# Variables
BUILD_DIR = build
SRC_DIR = src
BIN_DIR = $(BUILD_DIR)/bin
MAIN_CLASS = calculadora.Main

# Regla por defecto
all: cmake_build

# Regla para ejecutar CMake y construir el proyecto
cmake_build:
	mkdir -p $(BUILD_DIR)
	cd $(BUILD_DIR) && cmake ..
	cd $(BUILD_DIR) && cmake --build .

# Regla para ejecutar el proyecto
run:
	java -cp $(BIN_DIR) $(MAIN_CLASS)

# Regla para limpiar los archivos generados
clean:
	rm -rf $(BUILD_DIR)