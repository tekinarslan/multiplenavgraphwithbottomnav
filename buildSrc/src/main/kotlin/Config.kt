object Config {

    var versionMajor = 1
    var versionMinor = 0
    var versionPatch = 0

    const val minSdkVersion = 21
    const val compileSdkVersion = 30
    const val targetSdkVersion = 30

    val versionCode = versionMajor * 10000 + versionMinor * 100 + versionPatch
    val versionName = "${versionMajor}.${versionMinor}.${versionPatch}"
}
