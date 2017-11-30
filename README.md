# kotlin-rmwc

### Project Summary

This project is a Kotlin Wrapper for [React Material Web Components](https://github.com/jamesmfriedman/rmwc),
which is a React wrapper for [Google Material Components for the Web](https://material.io/components/web/)

### Use

To use this project, you need to use [JetBrains official wrapper for React](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-react)

This project is accessible via jitpack repository.

Step 1: Define the JitPack repository in your project

```groovy
repositories {
    maven { url 'https://jitpack.io' }
    // other repositories
}
```

Step 2: Include this project as a dependency

```groovy
dependencies {
    compile "com.github.rivasdiaz:kotlin-rmwc:$kotlin_rmwc_version"
    // other dependencies
}
```

where `kotlin_rmwc_version` can be set to:

* [master-SNAPSHOT](https://jitpack.io/#rivasdiaz/kotlin-rmwc/master-SNAPSHOT) to use the latest version in master
* any release version to use that specific version
* any commit checksum to use the version in that specific commit

Check the [Project in JitPack](https://jitpack.io/#rivasdiaz/kotlin-rmwc/) to see all possible versions.

### Documentation

This project tries to follows the same specification as RMWC.
All accessible properties are the same as the ones exposed in RMWC.
Please check the documentation for RMWC [here](https://jamesmfriedman.github.io/rmwc/).

