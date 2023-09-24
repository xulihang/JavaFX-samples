This repo tries to have this fix applied: https://github.com/openjdk/jfx/pull/1236


The source files of the `com.sun.javafx.text` are taken from the source of Liberica JDK 11.0.15: https://github.com/bell-sw/Liberica/releases/download/11.0.15.1%2B2/bellsoft-jdk11.0.15.1+2-src-full.tar.gz.


## Steps of Applying the Fix to a JRE

1. Compile the project as a jar.
2. Replace the `PrismTextLayout.class` of the JRE's with the class we just built.


OpenJDK + OpenJFX 11 I used: https://www.b4x.com/b4j/files/java/jdk-11.0.1.zip

I have to modify `javafx\lib\javafx.graphics.jar` to make it effective.
