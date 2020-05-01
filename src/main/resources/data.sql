CREATE extension IF NOT EXISTS "uuid-ossp";

-- Create Table users
INSERT INTO 
	users (
		id, 
		data_change_created_by, 
		data_change_created_time,
		data_change_last_modified_by,
		data_change_last_time,
		deleted,
		active,
		email,
		firstname,
		lastname,
		password,
		username
	) 
VALUES 
	(
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb', 
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		0,
		true,
		'admin1@mailinator.com',
		'admin1',
		'dhewan',
		'1234567890',
		'admin1'
	),
	(
		'd24eac05-b04a-43e6-9965-3f61de21bdcc', 
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		0,
		true,
		'user1@mailinator.com',
		'user1',
		'bhowo',
		'1234567890',
		'user1'
	),
	(
		'396e098c-134b-4bde-96d9-cc5d6c2c2d67', 
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		0,
		true,
		'moderator1@mailinator.com',
		'moderator1',
		'ajha',
		'1234567890',
		'moderator1'
	),
	(
		'7bc2f7db-639a-4e2e-85e9-205eddeacb0a', 
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		'b88fc75c-cfb8-499b-a9eb-8075a755bedb',
		NOW(),
		0,
		true,
		'guest1@mailinator.com',
		'guest1',
		'bawal',
		'1234567890',
		'guest1'
	);


-- Create Table roles
INSERT INTO 
	roles (
		id, 
		data_change_created_by, 
		data_change_created_time,
		data_change_last_modified_by,
		data_change_last_time,
		deleted,
		name
	) 
		
VALUES 
-- uuid_generate_v4()
	(
		'a74ca58b-63e7-4c6d-b5f7-418e7d5dc8e9', 
		NULL,
		NOW(),
		NULL,
		NOW(),
		0,
		'ADMIN'
	),
	(
		'2f94aea1-0172-4e8f-90a7-286f712a4ae0', 
		NULL,
		NOW(),
		NULL,
		NOW(),
		0,
		'USER'
	),
	(
		'f0c395c1-ce30-4152-aeba-95d5a4f05764', 
		NULL,
		NOW(),
		NULL,
		NOW(),
		0,
		'MODERATOR'
	),
	(
		'61c624f8-d315-4c5e-8c06-5ea524d90581', 
		NULL,
		NOW(),
		NULL,
		NOW(),
		0,
		'GUEST'
	);

-- Create Table users_roles
INSERT INTO 
	users_roles (
		user_id,
		role_id
	) 
VALUES
	('b88fc75c-cfb8-499b-a9eb-8075a755bedb', 'a74ca58b-63e7-4c6d-b5f7-418e7d5dc8e9'),
	('d24eac05-b04a-43e6-9965-3f61de21bdcc', '2f94aea1-0172-4e8f-90a7-286f712a4ae0'),
	('396e098c-134b-4bde-96d9-cc5d6c2c2d67', 'f0c395c1-ce30-4152-aeba-95d5a4f05764'),
	('7bc2f7db-639a-4e2e-85e9-205eddeacb0a', '61c624f8-d315-4c5e-8c06-5ea524d90581');

