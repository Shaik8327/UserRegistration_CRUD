create database ini8labs;
use ini8labs;

CREATE TABLE Registration (
    ID INT AUTO_INCREMENT PRIMARY KEY,     
    Name VARCHAR(50) NOT NULL,              
    Email VARCHAR(150) NOT NULL UNIQUE,      
    Password VARCHAR(255) NOT NULL,          
    DateOfBirth DATE NOT NULL,               
    PhoneNumber INT,        
    Address TEXT,                            
    RegistrationDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Timestamp of registration
);

