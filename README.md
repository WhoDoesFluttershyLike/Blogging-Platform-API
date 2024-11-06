# Personal Blogging Platform API


## Description

This is a simple **RESTful API** for a **Personal Blogging Platform**. The API allows users to perform basic **CRUD operations** on blog articles.


## Technologies Used

- **Backend Framework**: Spring Boot (Java)
- **Database**: PostgreSQL (SQL)
- **API Protocol**: REST
- **Tools**: Maven, IntelliJ IDEA


## Features

- **List articles**: Retrieve a list of all published articles with optional filters such as publishing date or tags.
- **Single article view**: Retrieve details of a single article by its ID.
- **Create an article**: Add a new article to the platform.
- **Update an article**: Modify an existing article based on its ID.
- **Delete an article**: Remove an article by its ID.


## Endpoints

### 1. Get all articles
**GET** `/api/v1/read-all`
**Description**: Retrieve a list of all published articles.

### 2. Get a single article
**GET** `/api/v1/read`
**Description**: Retrieve a specific article by its ID.

### 3. Create a new article
**POST** `/api/v1/create-post`
**Description**: Create a new article to be published.

### 4. Update an article
**PUT** `/api/v1/update`
**Description**: Update an existing article by specifying its ID.

### 5. Delete an article
**DELETE** `/api/v1/delete`
**Description**: Delete an article by its ID.


## Installation

**1. Clone the repository**: git clone https://github.com/WhoDoesFluttershyLike/Blogging-Platform-API.git

cd Blogging-Platform-API

**2. Install dependencies**: mvn clean install

**3. Set up the database**: change user and password

**4. Run the application**: mvn spring-boot:run

**The application will start on**: http://localhost:8081















