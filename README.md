"# simple project http requests on play" 
1. git clone https://github.com/sharaalfa/simple.git
2. Импорт проекта через build.sbt в IntelliJ IDEA
3.В терминале вызвать sbt
4. Запустить команду run
5. В cmd, если Windows, либо откройте еще одно терминала, если линукс или мак, набрать обозначенную задачей команду:
curl -H "Content-Type: application/json" -X POST -d "{\"number\":5}" http://localhost:9000/factorial
Итого: В терминале, где запущен run, вы увидите {"result": 120}
