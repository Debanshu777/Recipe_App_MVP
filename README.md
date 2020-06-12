# Recipe_App🥗🥘

This is Native Java Android App is based on the data that is fetched from <b>TheMealDB</b> Api (<a href="https://www.themealdb.com/api.php">link</a>) 

#### Under active development👨‍💻
<br>

## Screenshots📷
<table>
  <tr>
    <td>Loading Screen with Shimmer</td>
     <td>Main Interface</td>
     <td>On Tap on any card(loading..)</td>
  </tr>
  <tr>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image1.png" width=240 height=410/></td>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image2.png" width=240 height=410/></td>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image3.png" width=240 height=410/></td>
  </tr>
  <tr>
    <td>Catagory Interface</td>
     <td>On Scroll Data Fetched from Api </td>
     <td>On tap on any Item(loading..)</td>
     <td>Detail Interface</td>
  </tr>
  <tr>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image4.png" width=240 height=410/></td>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image5.png" width=240 height=410/></td>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image6.png" width=240 height=410/></td>
    <td><img src="https://github.com/Debanshu777/Recipe_App/blob/master/Images/image7.png" width=240 height=410/></td>
  </tr>
 </table>

<br>

## Dependencies
<br>

### • Butterknife(<a href="https://github.com/JakeWharton/butterknife">More Info</a>)
Field and method binding for Android views which uses annotation processing to generate boilerplate code for you.

- Eliminate findViewById calls by using @BindView on fields.
- Group multiple views in a list or array. Operate on all of them at once with actions, setters, or properties.
- Eliminate anonymous inner-classes for listeners by annotating methods with @OnClick and others.
- Eliminate resource lookups by using resource annotations on fields<br><br>
<b>Note: This tool is now deprecated.</b>
```
  android {
  ...
  // Butterknife requires Java 8.
  compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_8
    targetCompatibility JavaVersion.VERSION_1_8
  }
}

dependencies {
  implementation 'com.jakewharton:butterknife:10.2.1'
  annotationProcessor 'com.jakewharton:butterknife-compiler:10.2.1'
}
```
<br>

### • Retrofit2 (<a href="https://github.com/square/retrofit">More Info</a>)
A type-safe HTTP client for Android and Java.<br><br>
<b>Note: Retrofit requires at minimum Java 8+ or Android API 21+.</b><br>
<b>Dependency for Retrofit:</b>
```
com.squareup.retrofit2:retrofit:2.9.0
```
<b>Depencency for Retrofit Gson Converter:</b>
```
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
```
<br>

### • Picasso (<a href="https://github.com/square/picasso">More Info</a>)
A powerful image downloading and caching library for Android
```
implementation 'com.squareup.picasso:picasso:2.71828'
```
<br>

### • Shimmer FB(<a href="https://github.com/facebook/shimmer-android">More Info</a>)
Shimmer is an Android library that provides an easy way to add a shimmer effect to any view in your Android app.
It is useful as an unobtrusive loading indicator, and was originally developed for Facebook Home.
```
implementation 'com.facebook.shimmer:shimmer:0.5.0'
```
<br>

## Design Architechture - Model–view–presenter(MVP)
Model–view–presenter (MVP) is a derivation of the model–view–controller (MVC) architectural pattern which mostly used for building user interfaces MVP is an architecture pattern that you can use to deal with some of the shortcomings of MVC, and is a good alternative architecture. It provides an easy way to think about the structure of your app. It provides <b>modularity, testability and, in general, a more clean and maintainable codebase</b>.

Picking apart the acronym, MVP is composed of the following components:

### Model:
The model will continue to contain the data in simple classes, so nothing really changes here.
<br>

### View: 
The view will continue to be implemented using Activity or Fragment classes, but we will change the scope of what the view controls.
<br>

### Presenter: 
The last part is the presenter, which handles UI updates based on changes to the data model, and also processes users inputs. The presenter will contain much of the business code and replaces the controller from MVC.<br>
<br>

In MVP, instead of having a controller Activity class which handles both changes to the model and what’s displayed on screen, the controller and view parts are separated out, and the both the presenter and view become more lightweight.
<br>

<b> Data (model) and UI (view), only communicate with one another through an intermediary (the presenter)</b> . The presenter contains the bulk of the business logic, while the view focuses on how to display the data. The controller responsibility is now split between the view and presenter. A presenter handles the flow of data, and abstracts away the business logic from the controller. The Android-specific code stays in the view layer, and the presenter can be tested independently from the Android SDK.

So how does data flow between these components? Take a look at this diagram:
![](https://koenig-media.raywenderlich.com/uploads/2018/09/mvp.png)
<br>

## How To Run This
<> Open your terminal (NOTE: git bash prefered/ Terminal on Android Studio/Any Other Editor)</br>
<> Run the git clone command and clone this repo.</br>
<> Navigate to the project folder where you have cloned the repo.</br>
<> Sync the project.</br>
<> Open an emulator or plug in a real device</br>
<> Run the App</br>
<br>

## Contributing
#### Feel Free To Contribute
Pull request are most welcomed, Add proper documentation to the part you contribute, Give me some time to review pull request Thank you.
#### Developed And Maintained by
😎<a href="https://github.com/Debanshu777">Debanshu777</a>
<br>

## License
This project is licensed under the MIT License - see the <a href="https://github.com/Debanshu777/Recipe_App/blob/master/LICENSE">LICENSE.md</a> file for details
<br>

## Getting Started
To get started read the Android developers <a href="https://developer.android.com/">documentation</a>
