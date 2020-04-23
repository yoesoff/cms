CREATE extension IF NOT EXISTS "uuid-ossp";

INSERT INTO 
	roles (
		id, 
		data_change_created_by, 
		data_change_created_time,
		data_change_last_modified_by,
		data_change_last_time,
		deleted,
	name) 
VALUES 
	(
		uuid_generate_v4(), 
		NULL,
		NOW(),
		NULL,
		NOW(),
		0,
		'ADMIN'
	);
