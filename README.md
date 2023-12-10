<h2>Getting Started</h2>
<h3>Change url of you're choosing database :</h3>
```
String url = "jdbc:database://host:port/databasename";
```
<h3>Create Necessary Table Query : </h3>
```
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `grade` varchar(45) NOT NULL,
  `class` varchar(45) NOT NULL,
  `studentid` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
```
