enablePlugins(CommonSettingsPlugin)
enablePlugins(CoverallsWrapper)

// Preserve the author's coding style
includeFilter in scalariformFormat := NothingFilter

organization := "me.lessis"

name := "prints"

description :=  "jwt interface for scala"

homepage := Some(url(s"https://github.com/meetup/${name.value}"))

resolvers += "softprops-maven" at "http://dl.bintray.com/content/softprops/maven"

libraryDependencies ++= Seq(
  "me.lessis" %% "base64" % "0.2.0",
  "org.json4s" %% "json4s-native" % "3.5.3"
)

bintrayOrganization in ThisBuild := Some("meetup")
bintrayPackageLabels in ThisBuild := Seq("jwt")

pomExtra :=
  <scm>
    <url>git@github.com:softprops/{name.value}.git</url>
    <connection>scm:git:git@github.com:softprops/{name.value}.git</connection>
  </scm>
  <developers>
    <developer>
      <id>softprops</id>
      <name>Doug Tangren</name>
      <url>https://github.com/softprops</url>
    </developer>
  </developers>
