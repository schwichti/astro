

## Setting up Eclipse workspace
Clone this repository:
```bash
git clone git@github.com:schwichti/astro.git
```

Open terminal and change directory to astro repository:
```bash
cd astro
```

Download gradle wrapper (see https://docs.gradle.org/current/userguide/gradle_wrapper.html):
```bash
gradle wrapper
```

Build Astro
```bash
./gradlew build
```

Generate Eclipse projects
```bash
./gradlew eclipse
```

Download latest version of Eclipse

Install Xtend Eclipse plugins
http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

Add local repository to Eclipse (that you have already cloned before) and import existing projects (that you have already generated with gradle before):
http://wiki.eclipse.org/EGit/User_Guide#Cloning_or_adding_Repositories
