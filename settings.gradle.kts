pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "Floodlight"

include(":app")

// Pure-Kotlin layers — these become `commonMain` when we move to KMP
include(":core:model")
include(":core:domain")
include(":core:network")
include(":core:data")

// Android-only layers
include(":core:designsystem")
include(":core:ui")
include(":core:ads")
include(":core:preferences")

include(":feature:matches")
include(":feature:matchdetail")
include(":feature:series")
include(":feature:players")
include(":feature:rankings")
include(":feature:news")
include(":feature:settings")
