## Preparations
Software you need:
* Java (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Gradle (https://gradle.org/install/)

## Building Astro
Clone this repository:
```bash
git clone git@github.com:schwichti/astro.git
```

Open terminal and change directory to astro repository:
```bash
cd astro
```

Build Astro
```bash
./gradlew build
```

## Setting up Eclipse workspace
Build Astro (see above)

Generate Eclipse projects
```bash
./gradlew eclipse
```

Download latest version of Eclipse (http://www.eclipse.org/downloads/)

Many classes of Astro are written in Xtend (https://www.eclipse.org/xtend/). Xtend adds syntactic sugar on top of Java.
Install Xtend Eclipse plugins
http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

Add local repository to Eclipse (that you have already cloned before) and import existing projects (that you have already generated with gradle before):
http://wiki.eclipse.org/EGit/User_Guide#Cloning_or_adding_Repositories
