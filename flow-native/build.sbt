import flow.{FlowBuild}

FlowBuild.commonSettings

enablePlugins(JniNative)

sourceDirectory in nativeCompile := sourceDirectory.value
