Compatibility matrix for **jdplus-main**

|                     |            | v3.7.1 |
|---------------------|------------|--------|
| jdplus-benchmarking | **v2.1.0** | ✅      |
| jdplus-incubator    | **v2.4.1** | ✅      |
| jdplus-experimental | **v1.1.0** | 🔥     |
| jdplus-revisions    | **v1.1.0** | ✅      |
| jdplus-nowcasting   | **v2.0.0** | ✅      |
| jdplus-sdmx         | **v3.3.4** | ✅      |

<details><summary>jdplus-experimental @ v1.1.0 -> v3.7.1</summary>

```
[ERROR] Failed to execute goal on project jdplus-toolkitx-base-core: Could not resolve dependencies for project eu.europa.ec.joinup.sat:jdplus-toolkitx-base-core:jar:1.1.0
[ERROR] dependency: eu.europa.ec.joinup.sat:jdplus-sts-base-core:jar:3.7.1 (compile)
[ERROR] 	Could not find artifact eu.europa.ec.joinup.sat:jdplus-sts-base-core:jar:3.7.1 in central (https://repo.maven.apache.org/maven2)
[ERROR] -> [Help 1]
[ERROR] Failed to execute goal on project jdplus-toolkitx-base-r: Could not resolve dependencies for project eu.europa.ec.joinup.sat:jdplus-toolkitx-base-r:jar:1.1.0
[ERROR] dependency: eu.europa.ec.joinup.sat:jdplus-sts-base-r:jar:3.7.1 (compile)
[ERROR] 	Could not find artifact eu.europa.ec.joinup.sat:jdplus-sts-base-r:jar:3.7.1 in central (https://repo.maven.apache.org/maven2)
[ERROR] dependency: eu.europa.ec.joinup.sat:jdplus-sts-base-core:jar:3.7.1 (compile)
[ERROR] 	eu.europa.ec.joinup.sat:jdplus-sts-base-core:jar:3.7.1 was not found in https://repo.maven.apache.org/maven2 during a previous attempt. This failure was cached in the local repository and resolution is not reattempted until the update interval of central has elapsed or updates are forced
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :jdplus-toolkitx-base-core
```
</details>
