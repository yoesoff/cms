CREATE extension IF NOT EXISTS "uuid-ossp";
INSERT INTO roles VALUES (uuid_generate_v4(), 'ADMIN');
