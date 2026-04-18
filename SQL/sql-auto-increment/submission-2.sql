Create SEQUENCE gov_id Start with 1000 increment by 3;

Create table gov_employee(
    id  Integer generated always as Identity,
    gov_id Integer Default nextval('gov_id'),
    name Text
);


-- Do not modify below this line --
INSERT INTO gov_employee (name) 
  VALUES
      ('John Doe'),
      ('Jane Doe'),
      ('Jim Beam');

SELECT * FROM gov_employee;
