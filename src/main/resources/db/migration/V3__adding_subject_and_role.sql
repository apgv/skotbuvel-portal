CREATE TABLE subject (
  id           SERIAL PRIMARY KEY,
  original_id  INTEGER                  NOT NULL,
  active       BOOLEAN                  NOT NULL,
  first_name   VARCHAR(20)              NOT NULL,
  last_name    VARCHAR(20)              NOT NULL,
  email        VARCHAR(40)              NOT NULL,
  phone        VARCHAR(15),
  created_by   VARCHAR(50)              NOT NULL,
  created_date TIMESTAMP WITH TIME ZONE NOT NULL,
  deleted_by   VARCHAR(50),
  deleted_date TIMESTAMP WITH TIME ZONE
);

CREATE TABLE role (
  id           SERIAL PRIMARY KEY,
  original_id  INTEGER                  NOT NULL,
  active       BOOLEAN                  NOT NULL,
  name         VARCHAR(20)              NOT NULL,
  created_by   VARCHAR(50)              NOT NULL,
  created_date TIMESTAMP WITH TIME ZONE NOT NULL,
  deleted_by   VARCHAR(50),
  deleted_date TIMESTAMP WITH TIME ZONE
);

CREATE TABLE subject_role (
  subject_id INTEGER REFERENCES subject (id),
  role_id INTEGER REFERENCES role (id),
  PRIMARY KEY (subject_id, role_id)
);