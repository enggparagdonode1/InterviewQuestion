
INTERVIEW QUESTION:
=====================
1.) What are the differences between ANT and Maven.
- ANT is low level build tool
- MAVEN is high level build tool
- Need more time build and deployment
- Very less time required

2.) How do you create a jar/war file in Maven?
-$mvn install

3.)What is the difference between mvn deploy and mvn install?
-mvn:install copies your packaged Maven module to your local repository (by default, in ~/.m2/repository), to be accessed by other local Maven builds.

mvn:deploy uploads your packaged Maven module to another (usually remote) repository, to be accessed by other, not necessarily local, Maven builds.

4.)Can you explain Maven's lifecycle? [Give one line explanation about each phase during
your interview]
-validate - validate the project is correct and all necessary information is available
-compile - compile the source code of the project
-test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or       deployed
-package - take the compiled code and package it in its distributable format, such as a JAR.
-verify - run any checks on results of integration tests to ensure quality criteria are met
-install - install the package into the local repository, for use as a dependency in other projects locally
-deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

5.)What is Maven? Why we use Maven?
-Maven is chiefly used for Java-based projects, helping to download dependencies, which refers to the libraries or JAR files. The tool helps get the right JAR files for each project as there may be different versions of separate packages.

6.)While building the project, you get an error saying some jar file is missing. how do you
add that?
-Download the Dependency Add dependency in pom.xml
In pom.xml Nevigate to dependencies section add a new dependency in missing jar file

7.)What is groupId, artifactId, and Version in Maven?
-groupId – a unique base name of the company or group that created the project. artifactId – a unique name of the project. version – a version of the project.

8.)What are the Maven co-ordinates?
-Maven coordinates identify uniquely a project, a dependency, or a plugin defined in POM.

9.)What are the mandatory attributes in pom.xml?
-groupId, artifactId, version.

10.)What is the difference between 1.0-SNAPSHOT(SNAPSHOT) version and 1.0-
RELEASE(RELEASE) version.
-A "release" is the final build for a version which does not change. A "snapshot" is a build which can be replaced by another build which has the same name

11.)What is the default naming convention of an artifacts(jar/war) in Maven?
-groupId uniquely identifies your project across all projects. A group ID should follow Java's package name rules. This means it starts with a reversed domain name you control. For example,org.apache.maven, org.apache.commons
    artifactId is the name of the jar without version. If you created it, then you can choose whatever name you want with lowercase letters and no strange symbols. If it's a third party jar, you have to take the name of the jar as it's distributed.

    eg. maven, commons-math
    version if you distribute it, then you can choose any typical version with numbers and dots (1.0, 1.1, 1.0.1, ...). Don't use dates as they are usually associated with SNAPSHOT (nightly) builds. If it's a third party artifact, you have to use their version number whatever it is, and as strange as it can


12.)How do you generate a site in Maven?
-To generate a site, just run mvn site:site or mvn site.

13.)How do you run a clean build in Maven?
-$mvn clean

14.)how do you add a dependency in Maven pom.xml?
-    Set addClasspath to true in the pom. xml source. Open the pom. xml file and access the source view. ...
    Use the Dependencies tab of the POM editor to add the dependency. Click the Dependencies tab. Click Add to access the select dependency dialog.

14.)what is a plugin?
-A plugin is a software add-on that is installed on a program, enhancing its capabilities. For example, if you wanted to watch a video on a website, you may need a plugin to do so. If the plugin is not installed, your browser will not understand how to play the video.

15.)What is the default path of artifacts in local repository?
-By default, in all systems, the maven local repository location path is .m2/repository under home user.

16.)Where maven stores the built artifacts?
- in the local repository, which is the local cache where Maven stores all of the artifacts it has downloaded or found elsewhere. The default location of the local repository is the . m2/repository/ directory under the user's home directory.

17.)How do you create a project in the Maven?
-Using This Command
mvn archetype:generate -DgroupId=com.tylerhawkins.examples -DartifactId=plinko -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

18.)What are the different binary repositoris we have? Which one you are using for your
project?
-There are several binary repositories that are commonly used for Java projects, including:
1.	Apache Maven Central Repository: This is the default repository for Apache Maven and contains a large number of open-source Java libraries and frameworks.
2.	JCenter: This is a popular binary repository maintained by JFrog and hosts a large number of open-source Java libraries and frameworks.
3.	Google Maven Repository: This repository is hosted by Google and contains various libraries and artifacts for Android development.
4.	Sonatype Nexus Repository: This is a powerful binary repository manager that can be used to host both open-source and private artifacts.
 
5.	Artifactory: This is another popular binary repository manager that can be used to host both open-source and private artifacts.

19.)How do you customize the name of your artifact(jar/war) in Maven?
OR
How do you change the name of built jar/war file in maven? what changes you need to do in
pom.xml file?
-By default, Maven uses the artifactId, version, and packaging elements in the pom.xml file to generate the name of the artifact. The name of the artifact is typically in the format of <artifactId>-
<version>.<packaging> (e.g., my-app-1.0-SNAPSHOT.jar).
To customize the name of the artifact, you can use the finalName element in the build section of the pom.xml file.


20.)What do you mean by transitive dependency in Maven and can you explain how maven
resolves it?
-Maven avoids the need to discover and specify the libraries that your own dependencies require by including transitive dependencies automatically. 

21.)What is the significance/importance of scope parameter in dependency section?
-The scope parameter in the dependency section of a Maven project's pom.xml file specifies the scope of the dependency, which determines when and where the dependency is available during the build process.


22.)What are the different scope's we have in Maven?
-compile, runtime, test, provided, system and import.

23.)What inside the target folder?
-Target Root Folder
This folder contains the key subfolders for the target (see Folder and File Naming Conventions). You can also locate miscellaneous files (such as a readme file) in the target root folder.
