#!/bin/bash

mkdir -p bin

javac -d bin $(find src -name "*.java")

mapfile -t mains < <(find src -name "Main.java")


if [ ${#mains[@]} -eq 0 ]; then
    echo "No se encontró ningún archivo Main.java"
    exit 1
fi

echo "Selecciona el proyecto a ejecutar:"

for i in "${!mains[@]}"; do
    dir=${mains[$i]}
    echo "[$i] $dir"
done

read -p "Ingresa el número: " option

main=${mains[$option]}

bin=$(grep -m 1 '^package ' "$main" | awk '{print $2}' | tr -d ';')

echo "Ejecutando el proyecto en $main"
echo


java -cp $bin $main
