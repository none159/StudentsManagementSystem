# Getting Started
## Change url of you're choosing database :

```
String username = "you're username";
String url = "jdbc:database://host:port/databasename";
String password = "you're password";
```

## Create Necessary Table Query : 

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
