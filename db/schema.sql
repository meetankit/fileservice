create database files;
CREATE TABLE files (
	filekey BIGINT (21)  NOT NULL,
    previewUrl VARCHAR(256) NOT NULL,
    description VARCHAR(256) NOT NULL,
    name VARCHAR(256) NOT NULL,
    uploadedTo VARCHAR(32),
    filesize BIGINT (21) NOT NULL,
    status VARCHAR(128) NOT NULL,
    CONSTRAINT XPKFILES PRIMARY KEY (filekey)
);
