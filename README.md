# Libreria para leer archivos .txt y .dat

Libreria para leer archivos .txt y .dat facilmente.

## Descargas

[![Static Badge](https://img.shields.io/badge/Descargar-.jar-green.svg)](https://github.com/PaoloESAN/LibreriaArchivos/releases/download/release-final/LibreriaArchivos.jar)

### Para .txt:

#### Clase: ArchivoTXT
| Metodo      | Parametro| Retorna          | Descripcion    |
| :--------   | :------- | :------------    | :--------------|
| `selecArchivo`|  | `File`         | Abre una ventana para seleccionar el archivo .txt y lo retorna como un File|
| `leer`      | `string` | `string`         | Devuelve un string del archivo leído|
| `leer`      | `File` | `string`         | Devuelve un string del archivo leído|
| `leer`      |  | `string`         | Abre una ventana para seleccionar un archivo y devuelve un string del archivo leído|
| `leerLista` | `string` | `List<String[]>` | Devuelve un Lista de String[] del archivo leído|
| `leerLista` | `File` | `List<String[]>` | Devuelve un Lista de String[] del archivo leído|
| `leerLista` |  | `List<String[]>` | Abre una ventana para seleccionar un archivo y devuelve un Lista de String[] del archivo leído|

### Para .dat:

#### Clase: ArchivoDAT
| Metodo      | Parametro| Retorna          | Descripcion    |
| :--------   | :------- | :------------    | :--------------|
| `selecArchivo`|  | `File`         | Abre una ventana para seleccionar el archivo .dat y lo retorna como un File|
| `leer`      | `string`,`int` | `string`         | Devuelve un string del archivo leído, debes pasarle la longitud de cada linea|
| `leer`      | `File`,`int` | `string`         | Devuelve un string del archivo leído, debes pasarle la longitud de cada linea|
| `leer`      | `int` | `string`         | Abre una ventana para seleccionar un archivo y devuelve un string del archivo leído, debes pasarle la longitud de cada linea|
| `leerLista` | `string`,`int` | `List<String[]>` | Devuelve un Lista de String[] del archivo leído, debes pasarle la longitud de cada linea|
| `leerLista` | `File`,`int` | `List<String[]>` | Devuelve un Lista de String[] del archivo leído, debes pasarle la longitud de cada linea|
| `leerLista` | `int` | `List<String[]>` | Abre una ventana para seleccionar un archivo y devuelve un Lista de String[] del archivo leído, debes pasarle la longitud de cada linea|
