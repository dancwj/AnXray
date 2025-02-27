include(":library:core")
include(":library:shadowsocks")
include(":library:shadowsocksr")

include(":plugin:api")

include(":external:preferencex:preferencex")
include(":external:preferencex:preferencex-simplemenu")
include(":external:preferencex:flexbox")
include(":external:preferencex:colorpicker")
include(":external:preferencex:preferencex-colorpicker")

includeBuild("external/editorkit") {
    name = "editorkit"
    dependencySubstitution {
        substitute(module("editorkit:editorkit:2.0.0")).with(project(":editorkit"))
        substitute(module("editorkit:feature-editor:2.0.0")).with(project(":features:feature-editor"))
        substitute(module("editorkit:language-json:2.0.0")).with(project(":languages:language-json"))
    }
}

include(":app")
rootProject.name = "AnXray"