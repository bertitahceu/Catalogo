compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin
jar:compilar
	jar cvfm ap-personas.kar Mainfest.txt -C bin .
ejecutar:compilar
	java -cp bin aplicacion.Principal
limpiar:
	rm -rf bin
javadoc:compilar
	find . -type f -name "*.java" | xargs javadoc -d html -encoding uft-8 -decencoding uft-8 -charset uft-8
