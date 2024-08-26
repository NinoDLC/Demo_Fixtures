# Demo_Fixtures
A demo project for [Fixtures](https://en.wikipedia.org/wiki/Test_fixture) in Kotlin for Android. 

There's 3 branches: 
* `master`, which is the "base" for the 2 other branches. 
There's some unit tests that need refactoring ([`getDefaultUser()`](app/src/test/java/fr/delcey/demo_fixts/MainViewModelTest.kt#L44) should be in the `data` module).
* `fixtures`, which uses the new "fixtures" feature from Kotlin / AGP to produce fixtures from the `data` module and consume them in the `app` UTs. **/!\ Requires Kotlin 1.9.20 and Android Gradle Plugin 8.5, which requires Android Studio Koala /!\\**
* `module`, which is the "new old school way" to use fixtures: create a "base test module" and use it in your other modules as a simple dependency. 