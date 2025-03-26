# Spring Boot Blog Platform

This project is a Spring Boot-based blog platform, developed following the tutorial by [Aaron Bourne](https://www.youtube.com/@devtiro) on the [Devtiro Community](https://community.devtiro.com/c/welcome/) webpage.

## Features

* **Category system** for organizing posts
* **Flexible tagging system** that supports multiple tags per post
* **Post creation** with draft and published states
* **Filtering** functionality for both categories and tags
* **User authentication**

## Getting Started (Docker & Node Based Setup on Windows)

This setup assumes you're using Docker for the database and Node.js for the frontend.

1.  **Install and Run Docker:**
    * Download and install [Docker Desktop](https://www.docker.com/products/docker-desktop/).
    * Start Docker Desktop.

2.  **Set up the Database with Docker Compose:**
    * Navigate to the project's root directory in your terminal.
    * Run the following command to start the database container (assuming you have a `docker-compose.yml` file configuring your database):

        ```bash
        docker-compose up -d
        ```

        * The `-d` flag runs the container in detached mode (in the background).
        * Ensure that your `application.properties` or `application.yml` file is configured to connect to the docker database.

3.  **Install Node.js:**
    * Download and install [Node.js](https://nodejs.org/en/download).

4.  **Install Frontend Dependencies:**
    * Navigate to the frontend directory in your terminal.
    * Run the following command to install the necessary Node.js dependencies:

        ```bash
        npm install
        ```

5.  **Run the Frontend Application:**
    * Run the following command to start the frontend development server:

        ```bash
        npm run dev
        ```

6.  **Run the Spring Boot Backend Application:**
    * run the spring boot application:

        ```bash
        ./mvnw spring-boot:run
        ```

7.  **Access the Application:**
    * Open your web browser and visit `http://localhost:5173/` (or the appropriate port specified by your frontend).
