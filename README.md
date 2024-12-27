# Media Viewer app

## Iris Android Home Assignment

Develop a media viewer Android application that displays media items.\
The media consists of thumbnails from Swedish cities, and each city has a few associated videos, accessible via URLs.\
The app should allow the user to navigate through media items using swipe gestures.

### Formal requirements:
◦ This repository **can be cloned** and used as a starter (dataset, and parsing are already added). If you do so, please use at least **Android Studio Koala Feature Drop | 2024.1.2 Patch 1** to be able to compile.\
◦ You can also **start your implementation from scratch**, then you will need the _'media_items.json'_ file from assets folder of this repository.\
◦ **DO NOT PUSH** anything here, please create **your own repository**, mark it as **private**, and **add [this user](https://github.com/ujszaszik) as a collaborator**.\
◦ Please use **commits for smaller chunks** of functionality, with **meaningful commit messages**.

### Functional requirements:

**1. Displaying Media Items:**\
◦ Display the thumbnail of the first media item in the list when the app is launched.\
◦ Display the title of the current media item at the top of the screen.

**2. Main Screen Navigation (Thumbnail View)**

***◦ Vertical Swiping (Up/Down):***\
▪ On the main screen, allow users to swipe up or down to browse through thumbnails of the media items.\
▪ When the user swipes up, the next media item’s thumbnail should be displayed.\
▪ When the user swipes down, the previous media item’s thumbnail should be displayed.\
▪ Ensure that up/down swiping is only enabled when the user is on the thumbnail page.\
▪ Swiping up or down should be disabled if there are no more media items in that direction.\
▪ _**BONUS POINT:**_ Make an animation that has the item that is leaving screen collapse, and the one that is entering the screen expand.

**3. Video Playback (Right/Left Swiping)**

***◦ Right Swipe (Open Videos):***\
▪ When the user swipes right, display the videos attached to the current media item (from the thumbnail page).\
▪ Videos should appear one by one, starting from the most recent, in uploaded time order.\
▪ If there are no more videos for the current media item, swiping right is disabled.\
***◦ Left/Right Swiping (Switch Between Videos):***\
▪ Allow users to swipe right to view the next video and swipe left to go back to the previous video.\
▪ _**BONUS POINT**_: Make transition animation between videos when switching from one to another.

### Technical acceptance criteria:

**◦ Kotlin Only:** The entire project must be written in **Kotlin**, Java code is not accepted.\
**◦ Reactive paradigm:** Make use of **Coroutines** and **Flows** for data handling.\
**◦ Jetpack Compose:** The UI should be built using Jetpack Compose for all\
    components. Avoid using XML for any layout-related tasks.\
**◦ Optional DI:** Dependency Injection is optional for this assignment. However, if you
    decide to implement DI, please use **Hilt** for that.\
**◦ MVVM Preferred:** The preferred architecture pattern to use in the application is **MVVM**, but you're free to use any other architecture of your choice. 
      If you deviate from MVVM, ensure the architecture you use is well-structured and maintainable.\
**◦ Separation of Concerns:** Ensure proper separation of concerns between the UI, data, and business logic layers.\
**◦ Testing:** Unit tests or UI tests are **not required** as part of this assignment.

### Questions:

_If you have any questions, feel free to reach out to me at the following email address: karoly@iris.la_
