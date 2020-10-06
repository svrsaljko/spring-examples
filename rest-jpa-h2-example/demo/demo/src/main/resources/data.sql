	DROP TABLE IF EXISTS students;
	 
	CREATE TABLE students (
	  id INT AUTO_INCREMENT  PRIMARY KEY,
	  first_name VARCHAR(250) NOT NULL,
	  last_name VARCHAR(250) NOT NULL,
	  college VARCHAR(250) DEFAULT NULL
	);
	 
	INSERT INTO students (first_name, last_name, college) VALUES
	  ('Stipe', 'Pipe', 'FESB'),
	  ('Stipe', 'Stipic', 'FESB'),
	  ('Mate', 'Matic', 'FER'),
	  ('Mate', 'Antic', 'FER'),
	  ('Ante', 'Antic', 'FESB'),
	  ('Ante', 'Matic', 'FESB');