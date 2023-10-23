limpiar:
	rm -rf bin
	rm -rf html
compilar: limpiar 
	mkdir bin
	find src -name "*.java" | xargs javac -cp bin -d bin

jar: compilar
	jar cvfm aplicacionPlantillas.jar Manifest.txt -C bin .

javadoc: compilar
	find src -type f -name "*.java" | xargs javadoc -d html -encoding utf-8 -docencoding utf-8 -charset utf-8

anadir: jar
	java -jar aplicacionPlantillas.jar anadir

mostrar: jar 
	java -jar aplicacionPlantillas.jar mostrar

eliminar: jar
	java -jar aplicacionPLantillas.jar eliminar

ayuda : jar
	java -jar aplicacionPlantillas.jar ayuda


