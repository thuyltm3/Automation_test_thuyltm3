# Setting enviroment automation test with java
* Môi trường windown:
  - Settup chocolatey: https://chocolatey.org/
  - Dùng chocolatey settup java8 -> cài xong kiểm tra version bằng command
  - Dùng choco settup maven -> cài xong kiểm tra version bằng command
  - Settup Intellij
  - Settup Nodejs
  - Settup appium 
  (Cả 2 phiên bản window UI & command)
 
 * Môi trường linux:
  - Settup java8: sudo apt-get install openjdk-8-jdk -> cài xong kiểm tra version bằng command: java -version & settup biến môi trường JAVA_HOME = path(đường dẫn đến nới chứa file jdk)
  - Settup maven: sudo apt-get install maven -> cài xong kiểm tra version bằng command: mvn --version
  - Settup biến môi trường cho maven: M2_HOME = path(đường dẫn tới thư mục maven)
  -> Add JAVA_HOME, M2_HOME vào path chung
  
  
