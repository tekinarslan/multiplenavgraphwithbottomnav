object Libs {

    /**
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"

    /**
     * https://github.com/JakeWharton/RxBinding/
     */
    const val rxBinding =
        "com.jakewharton.rxbinding2:rxbinding:${Versions.rxBinding2}"
    const val rxBindingAppcompat =
        "com.jakewharton.rxbinding2:rxbinding-appcompat-v7-kotlin:${Versions.rxBinding2}"

    /**
     * https://github.com/bumptech/glide
     */
    const val glide =
        "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler =
        "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val glideOkhttp3 =
        "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"

    /**
     * http://github.com/square/leakcanary/
     */
    const val leakcanaryNoOp =
        "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakcanary}"
    const val leakcanarySupportFragment =
        "com.squareup.leakcanary:leakcanary-support-fragment:${Versions.leakcanary}"
    const val leakcanary =
        "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"

    /**
     * https://developer.android.com/testing
     */
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"

    /**
     * https://github.com/square/retrofit
     */
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    /**
     * https://developer.android.com/studio
     */
    const val databindingAdapters =
        "androidx.databinding:databinding-adapters:${Versions.databinding}"
    const val databindingCommon = "androidx.databinding:databinding-common:${Versions.databinding}"
    const val databindingCompiler =
        "androidx.databinding:databinding-compiler:${Versions.databinding}"
    const val databindingRuntime =
        "androidx.databinding:databinding-runtime:${Versions.databinding}"
    const val viewbinding = "androidx.databinding:viewbinding:${Versions.databinding}"

    /**
     * https://square.github.io/okhttp/
     */
    const val okhttp = "com.squareup.okhttp3:okhttp:" + Versions.okhttp
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okhttpMockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    /**
     * https://kotlinlang.org/
     */
    const val kotlinAllOpen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"
    const val kotlinKapt =
        "org.jetbrains.kotlin:kotlin-annotation-processing-gradle:${Versions.kotlin}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

    /**
     * https://github.com/facebook/stetho
     */
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkhttp3 = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val fragment = "androidx.fragment:fragment-ktx:${Versions.androidxFragment}"
    const val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.androidxFragment}"

    /**
     * https://developer.android.com/testing
     */
    const val androidxTestRules = "androidx.test:rules:${Versions.androidxTest}"
    const val androidxTestRunner = "androidx.test:runner:${Versions.androidxTest}"

    /**
     * http://www.powermock.org
     */
    const val powermockMockito2 = "org.powermock:powermock-api-mockito2:${Versions.powermock}"
    const val powermockModuleJunit4 = "org.powermock:powermock-module-junit4:${Versions.powermock}"

    /**
     * https://github.com/mockito/mockito
     */
    const val mockito = "org.mockito:mockito-android:${Versions.mockito}"
    const val mockitoCore = "org.mockito:mockito-core:${Versions.mockito}"

    /**
     * http://jacoco.org
     */
    const val jacocoAgent = "org.jacoco:org.jacoco.agent:${Versions.jacoco}"
    const val jacocoAnt = "org.jacoco:org.jacoco.ant:${Versions.jacoco}"

    const val playCore = "com.google.android.play:core-ktx:${Versions.playCore}"

    /**
     * https://developer.android.com/studio
     */
    const val buildGradlePlugin = "com.android.tools.build:gradle:${Versions.buildGradlePlugin}"

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"

    const val detekt = "io.gitlab.arturbosch.detekt:io.gitlab.arturbosch.detekt.gradle.plugin:${Versions.detekt}"
    const val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.detekt}"
    const val detektCli = "io.gitlab.arturbosch.detekt:detekt-cli:${Versions.detekt}"

    const val firebaseAppDistributionGradle =
        "com.google.firebase:firebase-appdistribution-gradle:${Versions.firebaseAppDistributionGradle}"

    const val playServicesAuthPhone =
        "com.google.android.gms:play-services-auth-api-phone:${Versions.playServicesAuthPhone}"

    const val sectionedRecyclerViewAdapter =
        "io.github.luizgrp.sectionedrecyclerviewadapter:sectionedrecyclerviewadapter:${Versions.sectionedRecyclerViewAdapter}"

    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltWorkManager = "androidx.hilt:hilt-work:${Versions.hiltWork}"
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"

    @Deprecated("Check with HX, only hx uses this")
    const val retrofitRxAdapter = "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:${Versions.retrofitRxAdapter}"

    const val playServicesAnalytics = "com.google.android.gms:play-services-analytics:${Versions.playServicesAnalytics}"
    const val playServicesWallet = "com.google.android.gms:play-services-wallet:${Versions.playServicesWallet}"
    const val playServicesAuth = "com.google.android.gms:play-services-auth:${Versions.playServicesAuth}"
    const val playServicesLocation = "com.google.android.gms:play-services-location:${Versions.playServicesLocation}"
    const val playServicesAds = "com.google.android.gms:play-services-ads:${Versions.playServicesAds}"

    const val googleServices = "com.google.gms:google-services:${Versions.googleServices}"

    const val imageCropper = "com.theartofdev.edmodo:android-image-cropper:${Versions.imageCropper}"

    /**
     * https://github.com/facebook/facebook-android-sdk
     */
    const val facebook = "com.facebook.android:facebook-android-sdk:${Versions.facebook}"

    const val firebaseCrashlyticsGradle =
        "com.google.firebase:firebase-crashlytics-gradle:${Versions.firebaseCrashlyticsGradle}"
    const val firebasePerfPlugin = "com.google.firebase:perf-plugin:${Versions.firebasePerfPlugin}"
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    const val firebaseAppIndexing = "com.google.firebase:firebase-appindexing"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    const val firebaseCore = "com.google.firebase:firebase-core"
    const val firebasePerf = "com.google.firebase:firebase-perf-ktx"

    /**
     * http://tools.android.com
     */
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val dynamicAnimation = "androidx.dynamicanimation:dynamicanimation:${Versions.dynamicAnimation}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val flexbox = "com.google.android:flexbox:${Versions.flexbox}"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.coordinatorLayout}"

    /**
     * https://github.com/visenze/visearch-sdk-android
     */
    const val visenze = "com.visenze:visearch-android:${Versions.visenze}"

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val workManagerRuntime = "androidx.work:work-runtime-ktx:${Versions.workManagerRuntime}"

    /**
     * http://github.com/square/assertj-android/
     */
    const val assertj = "com.squareup.assertj:assertj-android:${Versions.assertj}"

    const val installReferrer = "com.android.installreferrer:installreferrer:${Versions.installReferrer}"

    /**
     * http://www.AppsFlyer.com/
     */
    const val appsFlyer = "com.appsflyer:af-android-sdk:${Versions.appsFlyer}"

    const val braze = "com.appboy:android-sdk-ui:${Versions.braze}"

    /**
     * https://github.com/nhaarman/mockito-kotlin
     */
    const val mockitoKotlin = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"

    /**
     * https://github.com/Triple-T/gradle-play-publisher
     */
    const val playPublisher = "com.github.triplet.gradle:play-publisher:${Versions.playPublisher}"

    const val commonsCodec = "commons-codec:commons-codec:${Versions.commonsCodec}"

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val coreTesting = "androidx.arch.core:core-testing:${Versions.coreTesting}"

    /**
     * https://github.com/Pragmatists/JUnitParams
     */
    const val junitParams = "pl.pragmatists:JUnitParams:${Versions.junitParams}"

    /**
     * http://robolectric.org
     */
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

    /**
     * https://github.com/intuit/sdp
     */
    const val sdpAndroid = "com.intuit.sdp:sdp-android:${Versions.sdpAndroid}"

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"

    const val cropLayout = "me.littlecheesecake:croplayout:${Versions.cropLayout}"

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val viewPager2 = "androidx.viewpager2:viewpager2:${Versions.viewPager2}"

    /**
     * https://github.com/flipkart-incubator/zjsonpatch/
     */
    @Deprecated("Hx is using this unfortunately")
    const val zJsonPatch = "com.flipkart.zjsonpatch:zjsonpatch:${Versions.zjsonPatch}"

    /**
     * https://developer.android.com/jetpack/androidx
     */
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    /**
     * https://github.com/ReactiveX/RxAndroid
     */
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

    /**
     * http://developer.android.com/tools/extras/support-library.html
     */
    const val viewPager = "androidx.viewpager:viewpager:${Versions.viewPager}"

    const val blurView = "com.eightbitlab:blurview:${Versions.blurView}"

    /**
     * https://github.com/ncapdevi/FragNav
     */
    const val fragNav = "com.ncapdevi:frag-nav:${Versions.fragNav}"

    /**
     * Huawei
     */
    const val huaweiAgConnectCore = "com.huawei.agconnect:agconnect-core:${Versions.huaweiAgConnect}"
    const val huaweiAgConnectCrash = "com.huawei.agconnect:agconnect-crash:${Versions.huaweiAgConnect}"
    const val huaweiAgConnectAgcp = "com.huawei.agconnect:agcp:${Versions.huaweiAgConnect}"
    const val huaweiAnalytics = "com.huawei.hms:hianalytics:${Versions.huaweiAnalytics}"
    const val huaweiLocation = "com.huawei.hms:location:" + Versions.huaweiLocation
    const val huaweiMap = "com.huawei.hms:maps:${Versions.huaweiMap}"
    const val huaweiSite = "com.huawei.hms:site:${Versions.huaweiSite}"
    const val huaweiPush = "com.huawei.hms:push:${Versions.huaweiPush}"

    /**
     * https://github.com/material-components/material-components-android
     */
    const val material = "com.google.android.material:material:${Versions.material}"

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val pagingRxJava2 = "android.arch.paging:rxjava2:${Versions.rxJava2}"
    const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:${Versions.rxRelay}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

    /**
     * http://facebook.github.io/shimmer-android
     */
    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmer}"

    /**
     * https://github.com/airbnb/lottie-android
     */
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    /**
     * https://github.com/ybq/Android-SpinKit
     */
    const val spinKit = "com.github.ybq:Android-SpinKit:${Versions.spinKit}"

    const val places = "com.google.android.libraries.places:places:${Versions.places}"

    /**
     * https://github.com/kittinunf/Result
     */
    const val result = "com.github.kittinunf.result:result:${Versions.result}"

    /**
     * https://github.com/robinhood/ticker/
     */
    const val ticker = "com.robinhood.ticker:ticker:${Versions.ticker}"

    /**
     * https://github.com/square/logcat
     */
    const val logcat = "com.squareup.logcat:logcat:${Versions.logcat}"

    /**
     * https://github.com/JakeWharton/timber
     */
    @Deprecated("Hx is using this unfortunately")
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    /**
     * http://junit.org
     */
    const val junit = "junit:junit:${Versions.junit}"

    /**
     * https://github.com/Kotlin/kotlinx.coroutines
     */
    const val kotlinx_coroutines_test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    const val androidCoreTesting = "android.arch.core:core-testing:${Versions.androidCoreTesting}"

    /**
     * http://mockk.io
     */
    const val mockk = "io.mockk:mockk:${Versions.mockk}"

    /**
     * https://github.com/google/gson
     */
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    /**
     * https://github.com/square/okio/
     */
    const val okio = "com.squareup.okio:okio:${Versions.okio}"

    /**
     * http://github.com/square/otto/
     */
    const val otto = "com.squareup:otto:${Versions.otto}"

    /**
     * https://github.com/dm77/barcodescanner
     */
    const val zbar = "me.dm7.barcodescanner:zbar:${Versions.zbar}"

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidxNavigation}"
    const val navigationUi = "androidx.navigation:navigation-ui:${Versions.androidxNavigation}"
    const val navigationRuntime = "androidx.navigation:navigation-runtime:${Versions.androidxNavigation}"
    const val navigationSafeArgs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidxNavigation}"

    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val composeLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiUtil = "androidx.compose.ui:ui-util:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val animation = "androidx.compose.animation:animation:${Versions.compose}"
    const val tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val icons_extended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val compose_metarial_icons = "androidx.compose.material:material-icons-core:${Versions.compose}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.compose_activity}"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"
    const val composeCompiler = "androidx.compose.compiler:compiler:${Versions.compose}"
    const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.compose}"

    /**
     * https://developer.android.com/topic/libraries/app-startup
     */
    const val androidxStartup = "androidx.startup:startup-runtime:${Versions.androidxStartup}"

    /**
     * https://github.com/wasabeef/glide-transformations
     */
    const val glideTransformations = "jp.wasabeef:glide-transformations:${Versions.glideTransformations}"

    const val webkit = "androidx.webkit:webkit:${Versions.webkit}"

    /**
     * https://docs.newrelic.com/docs/mobile-monitoring/new-relic-mobile-android/install-configure/install-android-apps-gradle-android-studio/
     */
    const val newRelic = "com.newrelic.agent.android:android-agent:${Versions.newRelic}"
    const val newRelicPlugin = "com.newrelic.agent.android:agent-gradle-plugin:${Versions.newRelic}"

    /**
     * https://developers.google.com/ar/develop/java/quickstart
     */
    const val arCore = "com.google.ar:core:${Versions.arCore}"

    const val filamentAndroid = "com.google.android.filament:filament-android:${Versions.googleFilament}"
    const val filamentGltfio = "com.google.android.filament:gltfio-android:${Versions.googleFilament}"

    const val chucker = "com.github.chuckerteam.chucker:library:${Versions.chucker}"
    const val chuckerNoOp = "com.github.chuckerteam.chucker:library-no-op:${Versions.chucker}"

    /**
     * HX only
     */

    /**
     * https://developer.android.com/topic/libraries/architecture/index.html
     */
    const val pagingCommon = "androidx.paging:paging-common:${Versions.androidxPaging}"
    const val pagingRuntime = "androidx.paging:paging-runtime-ktx:${Versions.androidxPaging}"

    /**
     * https://github.com/EverythingMe/overscroll-decor
     */
    const val overscrollDecor = "me.everything:overscroll-decor-android:${Versions.overscrollDecor}"

    /**
     * INTERNAL
     */
    const val hepsiburadaPagerIndicator = "com.hepsiburada:pagerindicator:${Versions.hepsiburadaPagerIndicator}"
    const val hepsiburadaCodexis = "com.hepsiburada:codexis:${Versions.hepsiburadaCodexis}"
    const val hepsiburadaAnalytics = "com.hepsiburada:analytics:${Versions.hepsiburadaAnalytics}"
    const val hepsiburadaSceneFormSrc = "com.hepsiburada:sceneformsrc:${Versions.hepsiburadaSceneForm}"
    const val hepsiburadaSceneFormUx = "com.hepsiburada:sceneformux:${Versions.hepsiburadaSceneForm}"
    const val hepsiExpress = "com.hepsiburada:hepsiexpress:${Versions.hepsiExpress}"
    const val dynamicPage = "com.hepsiburada:dynamicpage:${Versions.dynamicPage}"
}
