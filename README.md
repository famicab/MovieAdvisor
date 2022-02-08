# MovieAdvisor
Aplicación basada en Spring que permite navegar por un archivo csv con datos de películas. Es posible mostrar todas las películas o filtrarlas por géneros, años o título.

## Instrucciones

```
  -lg
```
Muestra todos los géneros. No usa más parámetros.

```
  -ag genero1, genero2, genero3 ...
```
Muestra películas que pertenecen al menos a uno de los géneros indicados.

```
  -tg genero1, genero2, genero3 ...
```
Muestra películas que pertenecen a cada uno de los géneros indicados.

```
  -y año
```

Muestra películas que fueron estrenadas el año indicado.
``` 
  -b desde, hasta
```

Muestra películas estrenadas entre los años indicados.

``` 
  -t titulo
```

Muestra películas que contienen el título introducido.

``` 
  -h
```
Muestra un mensaje de ayuda.

## Fuentes
El archivo de películas se ha obtenido de Internet Movie Database. Este proyecto se ha realizado gracias al curso de Spring Core realizado en la plataforma Open Webinars, impartido por el profesor Luis Miguel López.
