set projectLocation=D:\Naresh_Dell Laptop\Projects\Project_14_Full Stack Java Developer\Naresh IT\Notes\08_Testing\Workspace\Testing_Proj_07_GitHub
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause