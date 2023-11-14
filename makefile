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



