# vodqa-uitest
# UI Mobile Automation Testing Project using Selenium, Appium and Android

# Gitignore
https://www.gitignore.io/api/java,maven,gradle,android,eclipse,code-java,intellij+all,androidstudio

# Steps to run the test from any computer:x
1. Download, install GIT and clone the repository about test project

1.1. Download and install GIT from: "https://git-scm.com/download"
1.2. Open the console / terminal and put: "git clone https://github.com/pedrojara2405/vodqa-uitest.git"

2. Download, install and setting environment variable about Java JDK

2.1. Download the Java JDK from "https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html"
2.2. From Environment variables: Set "JAVA_HOME" as System variable with value "~/jdk path/bin"

3. Download, install and setting environment variable about Android Studio

3.1. Download and install Adroid Studio with SDK from "https://developer.android.com/studio/
3.2. From Environment variables: Set "ANDROID_HOME" as User variable with value "~/android sdk path/
3.3. In order to work with Android tools from command line, so from Environment variables: Set SDK Tools into Path System variable with value "~/android sdk path/tools".
3.4. In order to work with Android Debug Bridge (adb) from command line, so from Environment variables: Set SDK Platforms Tools into Path System variable with value "~/android sdk path/platform-tools".

4. Open "vodqa-uitest" project on Android Studio and run Android Emulator

4.1. Open Android Studio
4.2. Click on Menu "File => Open..."
4.3. Put the project path and click on "Ok" button.
4.4. Click on Menu "Build => Rebuild Project". In order to download and add all libraries declarated as dependencies on "build.gradle" file from app folder
4.5. Click on Menu "Tools => AVD Manager". In order to create / select some Virtual Device, then wait to load fully the android emulator.

5. Download, install and setting the capabilities about Appium 

5.1. Download and install Appium Desktop from: "http://appium.io/".
5.2. Run Appium and click on menu "File => New Session Window..."
5.3. Into "Automatic Server" tab, in the "Desired Capabilities" section, set the following keys and values / JSON representation:
{
  "platformName": "Android",
  "app": "~git path/vodqa-uitest/vodqa.apk",
  "deviceName": "Android Emulator"
}
5.4. Click on "Save as" button, in order to save the capabilities as "vodqa".
5.5. Click on "Start Session" button