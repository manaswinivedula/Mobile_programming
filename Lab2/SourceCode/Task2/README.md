# WEB-MOBILE-PROGRAMMING_LAB2
##Team 11

### Pavan kumar chongala  class id: 09

### Saivarun Gadhewar class id:13

### Manohar Bollampally class id:07

### Introduction
The WhatsApp chat application Real time Android Chat Application using Firebase . WhatsApp or most of the other messaging apps rarely work on a peer to peer basis. So, it wouldn't open a connection (from your device) to each of your friends' devices. Instead your device connects to their server. ... WhatsApp will use that connection to send them your messages.

### Objectives
Our main objective is to make an android chat application for all version android users. The chat application with features like call, text, image and video sending etc.… The application should be user friendly.

### Approaches
We were inspired from the WhatsApp and other user-friendly chat app for the services to provide in the WhatsApp application which are evolving from simple chat to different services i.e. audio calls , video call , location sharing and other features.

### Parameters
Android studio for android and java , firebase and SQLite for database

### Workflow 
1.	The first user will signup and then if account is created the user can login using login credentials.
If any message or contact request was arrived at user,  it can be visible in phone notification bar.
                   
2.	This is our main page, when user sign in this the page appears first. Which shows the recent chat conversation and contacts list.
Will also have options like:
Profile, add contacts, notifications and logout.
    
At the very first login, we fetch data from firebase and store in local DB using SQLite, and at the later we do fetch chat history from end user’s local storage.
          
3.	After login user can select any friend chat history and can make conversation through text, phone call, and can send images, videos and emojis also. Even using the microphone also user can send the message to the friend. Even user can see the friend is last online time and all messages timings.
    
Even user can delete the chat conversation only in his chat and even user can update the friend contact details like number and name at any time for his contact record.
Even user can unfriend the contact at any time with delete friend option.
 
4.	To add new friends other than phone book, user can add through add contacts where he enters the friends email id then user can able make request to his friend. If friend accepts the request user can make chatting or else user cannot see the contact of friend. If any new contact is added to phone book user can see the contact after pressing the refresh button
   

5.	If any persons send the request it will be appear the notifications where user will have two options accept or reject contact as friend.
 
6.	The user will have an option of logout, when user press the logout button it appears a warning message like logout or cancel. If user logout from account, he will not receive any notification from the WhatsApp chat app.
 

### Conclusion: 
We developed this app for android all android versions, but it does not work other than android phones. It is user friendly application with less storage and good security for privacy details.

### References
https://www.androidtutorialpoint.com/firebase/real-time-android-chat-application-using-firebase-tutorial/
https://www.youtube.com/watch?v=gPqJcPtN18I&list=PLxefhmF0pcPmtdoud8f64EpgapkclCllj
