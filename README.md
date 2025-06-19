README Structure for Android App Development Practicum 

Basic Information

Start with a header section that includes the following basic details:

Playlist Manager 
Developer: Sibusisekile Sithole
Student Number: ST10481493
Group: Group 2
Subject: IMAD

Links
GitHub Repository: https://github.com/VCSTDN2024/imad5112-practicum-2025-ST10481493

Project Overview

Project Overview
The Playlist manager is a mobile application developed as part of an assignment in the IMAD subject. This app was created using Kotlin and Android Studio to help people create playlist and also be able to make reviews to the songs.

Users can enter a song, the artist, a rating and comments to the playlist. The project meets the assignment requirements by building a functional mobile app and using GitHub for version control with GitHub Actions.

Why:

The Playlist manager app is a simple app that's designed to help users create a playlist to store song details. It was built using Kotlin and Android Studio, the app allows users to input the name of the song and artist. Users are also able to rate the song and add comments.

App Purpose and Features

Purpose and Features
Purpose:
The main goal of the Playlist manager app is a simple app that's designed to help users create a playlist to store song details. The app allows users to input the name of the song and artist. Users are also able to rate the song and add comments.

Key Features:
-Playlist managing: Users enter a song, artist, rating and also add commits

-Error handling: Displays a warning if the input is empty or invalid. 

-Average button: Calculates the average of the ratings the user entered



Design Considerations

Design Considerations
The design of the Playlist manager was based on the following key considerations:

Easy navigation – The app features a simple and user-friendly design, making it easy for anyone to input the song and it details. 

Device compatibility – Designed to work smoothly across different screen sizes, ensuring a consistent experience on various Android devices.

Simple design – Focuses on features without unnecessary complexity, keeping the interface clean and straightforward.


GitHub and GitHub Actions Utilization

GitHub and GitHub Actions
This project was managed using GitHub for version control, where all code changes were pushed. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

GitHub Actions:
I utilized GitHub Actions to automate the build and deployment process. This includes:

Running automated tests to ensure the app’s functionality.
Compiling the app into APK and AAB files, which are the formats required for distribution.
Uploading these build artifacts to GitHub for easy access.
The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission.

Screenshots and App Demo

Screenshots

![image](https://github.com/user-attachments/assets/6e607ae8-b984-4d8a-8945-e36f96158020)

What you see here is the project fully running. The user filled in all the required questions except the artist. When you try and the song to the play by pressing the “Add to Playlist" button the programme automatically notice that there’s an error and a toast pops up informing the user that “Please enter valid data”, this let the user know that there’s something wrong

![image](https://github.com/user-attachments/assets/0789a80f-c891-413f-85b3-4d4ec57a446a)
 
What you see now in the screenshot is the main and how it is supposed to be correctly filled in. I have the first button which is “Add to Playlist”, that button takes whatever information the user has entered and stores it into an array. The second button “Detail” takes you to the second screen where you can see all your song’s detail that you have entered and then stored. The last button “Exit” will end the programme and kick the user out of the app. 

![image](https://github.com/user-attachments/assets/ef56adcf-edc1-4660-8f7c-83ea24b76dbe)
 
You now looking at the second screen where all your playlist of all the songs you have entered I the main screen appear here. A text view be used display all of the stored information. The first button “Display” simply displays all the stored information. The second button “Average” calculates the ratings that you have entered and will display on the text view. The last button “Return” takes the user back to the main activity which the main screen. 

Challenges and Learnings

During the development of this project, I encountered several challenges, including:

Handling user input validation
Solution: I put in checks to ensure the input field is not empty and only accepts valid input. Used toast messages to guide users when incorrect input is detected.



Why:

Reflecting on these challenges helped me develop strong problem-solving skills and a better understanding of Android development best practices.

By tackling input validation issues, I learned the importance of user-friendly error handling to improve the overall experience. Future Enhancements

Future Enhancements
While the current version of the app works fine, there are several features that could be added in the future, including:

A more improved way to enter actual song into the playlist 

Voice input – Enable users to speak instead of typing the time of day for added convenience.

These enhancements would improve the app’s usability and make it even more versatile for end-users.



