] compile

javac -sourcepath src -d build/classes src/oata/HelloWorld.java

] run

java -cp build/classes oata.HelloWorld

] build jar

jar cfm build/jar/HelloWorld.jar Manifest -C build/classes .

] run jar

java -jar build/jar/HelloWorld.jar