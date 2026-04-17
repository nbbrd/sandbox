Compatibility matrix for **jdplus-main**

|                   |            | v3.7.1 |
|-------------------|------------|--------|
| jdplus-sdmx       | **v3.3.4** | 🔥     |
| jdplus-nowcasting | **v2.0.0** | 🔥     |

<details><summary>jdplus-sdmx @ v3.3.4 -> v3.7.1</summary>

```
[ERROR] COMPILATION ERROR : 
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-base/jdplus-sdmx-base-parent/jdplus-sdmx-base-api/src/main/java/module-info.java:[13,33] module not found: jdplus.toolkit.base.tsp
[ERROR] COMPILATION ERROR : 
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[3,36] cannot access jdplus.toolkit.base.tsp.util.ShortLivedCache
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/util/ShortLivedCache.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[4,36] cannot access jdplus.toolkit.base.tsp.util.ShortLivedCachingLoader
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/util/ShortLivedCachingLoader.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxWebSourceService.java:[21,37] cannot access jdplus.toolkit.desktop.plugin.TsManager
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/TsManager.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxWebSourceService.java:[22,48] cannot access jdplus.toolkit.desktop.plugin.completion.AutoCompletionSpi
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/completion/AutoCompletionSpi.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[7,48] cannot access jdplus.toolkit.desktop.plugin.properties.NodePropertySetBuilder
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/properties/NodePropertySetBuilder.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[8,51] cannot access jdplus.toolkit.desktop.plugin.ui.properties.FileLoaderFileFilter
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/ui/properties/FileLoaderFileFilter.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileConfiguration.java:[4,36] cannot access jdplus.toolkit.base.tsp.util.PropertyHandler
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/util/PropertyHandler.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileConfiguration.java:[6,42] cannot access jdplus.toolkit.desktop.plugin.util.Persistence
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/util/Persistence.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[22,37] cannot access jdplus.toolkit.desktop.plugin.Config
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/Config.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[23,37] cannot access jdplus.toolkit.desktop.plugin.Persistable
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/Persistable.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[25,45] cannot access jdplus.toolkit.desktop.plugin.actions.Configurable
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/actions/Configurable.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[26,48] cannot access jdplus.toolkit.desktop.plugin.properties.PropertySheetDialogBuilder
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/properties/PropertySheetDialogBuilder.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[27,49] cannot access jdplus.toolkit.desktop.plugin.tsproviders.DataSourceProviderBuddy
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/DataSourceProviderBuddy.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[8,49] cannot access jdplus.toolkit.desktop.plugin.tsproviders.TsProviderProperties
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/TsProviderProperties.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[23,42] cannot access jdplus.toolkit.base.api.timeseries.TsMoniker
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-api/3.7.1/jdplus-toolkit-base-api-3.7.1.jar(/jdplus/toolkit/base/api/timeseries/TsMoniker.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[24,31] cannot access jdplus.toolkit.base.tsp.DataSet
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/DataSet.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[25,31] cannot access jdplus.toolkit.base.tsp.DataSource
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/DataSource.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[12,45] cannot access jdplus.toolkit.desktop.plugin.actions.AbilityNodeAction
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/actions/AbilityNodeAction.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[13,45] cannot access jdplus.toolkit.desktop.plugin.actions.Actions
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/actions/Actions.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[29,56] cannot access jdplus.toolkit.desktop.plugin.tsproviders.TsProviderNodes
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/TsProviderNodes.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[12,34] cannot access jdplus.main.desktop.design.SwingAction
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-main-desktop-design/3.7.1/jdplus-main-desktop-design-3.7.1.jar(/jdplus/main/desktop/design/SwingAction.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[13,34] cannot access jdplus.main.desktop.design.SwingComponent
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-main-desktop-design/3.7.1/jdplus-main-desktop-design-3.7.1.jar(/jdplus/main/desktop/design/SwingComponent.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[14,34] cannot access jdplus.main.desktop.design.SwingProperty
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-main-desktop-design/3.7.1/jdplus-main-desktop-design-3.7.1.jar(/jdplus/main/desktop/design/SwingProperty.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[17,37] cannot access jdplus.toolkit.desktop.plugin.ColorSchemeManager
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/ColorSchemeManager.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[19,48] cannot access jdplus.toolkit.desktop.plugin.concurrent.DefaultThreadFactory
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/concurrent/DefaultThreadFactory.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[20,49] cannot access jdplus.toolkit.desktop.plugin.tsproviders.DataSourceManager
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/DataSourceManager.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[295,55] cannot access jdplus.toolkit.desktop.plugin.util.ListTableModel
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/util/ListTableModel.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[4,31] cannot access jdplus.toolkit.base.tsp.DataSourceProvider
  bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/DataSourceProvider.class)
    class file has wrong version 65.0, should be 61.0
    Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[18,62] cannot find symbol
  symbol:   class ShortLivedCache
  location: class internal.sdmx.desktop.plugin.Caches
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxCommand.java:[31,19] cannot find symbol
  symbol:   class Builder
  location: class internal.sdmx.desktop.plugin.SdmxCommand
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxWebSourceService.java:[35,52] cannot find symbol
  symbol: class AutoCompletionSpi
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[38,54] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[38,20] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[60,55] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[60,20] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileConfiguration.java:[100,18] cannot find symbol
  symbol:   class Persistence
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileConfiguration
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[42,53] cannot find symbol
  symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[42,78] cannot find symbol
  symbol: class Configurable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[42,92] cannot find symbol
  symbol: class Persistable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[86,28] cannot find symbol
  symbol:   class Config
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[91,43] cannot find symbol
  symbol:   class Config
  location: class jdplus.sdmx.desktop.plugin.file.SdmxFileProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[42,54] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[42,20] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[69,55] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[69,20] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[97,53] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[97,20] cannot find symbol
  symbol:   class NodePropertySetBuilder
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebConfiguration.java:[203,18] cannot find symbol
  symbol:   class Persistence
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebConfiguration
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[54,52] cannot find symbol
  symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[54,77] cannot find symbol
  symbol: class Configurable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[54,91] cannot find symbol
  symbol: class Persistable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[84,48] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[101,48] cannot find symbol
  symbol:   class TsMoniker
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[135,28] cannot find symbol
  symbol:   class Config
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[140,43] cannot find symbol
  symbol:   class Config
  location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[29,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[30,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[39,46] cannot find symbol
  symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[90,57] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSetAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[27,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[33,49] cannot find symbol
  symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[33,67] cannot find symbol
  symbol: class DataSource
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[48,41] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSourceAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[70,37] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSourceAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[80,57] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSourceAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[49,2] cannot find symbol
  symbol: class SwingComponent
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[19,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[25,46] cannot find symbol
  symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[25,64] cannot find symbol
  symbol: class DataSourceProvider
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[39,41] cannot find symbol
  symbol:   class DataSourceProvider
  location: class jdplus.sdmx.desktop.plugin.web.actions.ListSourcesAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[63,37] cannot find symbol
  symbol:   class DataSourceProvider
  location: class jdplus.sdmx.desktop.plugin.web.actions.ListSourcesAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[24,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[30,46] cannot find symbol
  symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[30,64] cannot find symbol
  symbol: class DataSource
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[44,41] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[55,37] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[60,35] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[67,61] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[24,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[30,46] cannot find symbol
  symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[30,64] cannot find symbol
  symbol: class DataSource
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[44,41] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[55,37] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[60,28] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[67,54] cannot find symbol
  symbol:   class DataSource
  location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[41,18] cannot find symbol
  symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[53,18] cannot find symbol
  symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[36,33] cannot find symbol
  symbol: variable COLLECTION_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[37,33] cannot find symbol
  symbol: variable SERIES_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[32,25] cannot find symbol
  symbol: variable SOURCE_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[52,6] cannot find symbol
  symbol:   class SwingAction
  location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[55,6] cannot find symbol
  symbol:   class SwingAction
  location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[58,6] cannot find symbol
  symbol:   class SwingAction
  location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[61,6] cannot find symbol
  symbol:   class SwingProperty
  location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[74,6] cannot find symbol
  symbol:   class SwingProperty
  location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[24,25] cannot find symbol
  symbol: variable PROVIDER_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[29,25] cannot find symbol
  symbol: variable SOURCE_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[29,25] cannot find symbol
  symbol: variable SOURCE_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[104,32] cannot find symbol
  symbol:   variable ShortLivedCachingLoader
  location: class internal.sdmx.desktop.plugin.Caches
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxAutoCompletion.java:[55,16] constructor WebSourceCompletion in class internal.sdmx.desktop.plugin.SdmxAutoCompletion.WebSourceCompletion cannot be applied to given types;
  required: no arguments
  found:    @lombok.NonNull jdplus.sdmx.base.api.web.SdmxWebProvider
  reason: actual and formal argument lists differ in length
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project jdplus-sdmx-base-api: Compilation failure
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-base/jdplus-sdmx-base-parent/jdplus-sdmx-base-api/src/main/java/module-info.java:[13,33] module not found: jdplus.toolkit.base.tsp
[ERROR] -> [Help 1]
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.15.0:compile (default-compile) on project jdplus-sdmx-desktop-plugin: Compilation failure: Compilation failure: 
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[3,36] cannot access jdplus.toolkit.base.tsp.util.ShortLivedCache
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/util/ShortLivedCache.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[4,36] cannot access jdplus.toolkit.base.tsp.util.ShortLivedCachingLoader
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/util/ShortLivedCachingLoader.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxWebSourceService.java:[21,37] cannot access jdplus.toolkit.desktop.plugin.TsManager
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/TsManager.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxWebSourceService.java:[22,48] cannot access jdplus.toolkit.desktop.plugin.completion.AutoCompletionSpi
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/completion/AutoCompletionSpi.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[7,48] cannot access jdplus.toolkit.desktop.plugin.properties.NodePropertySetBuilder
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/properties/NodePropertySetBuilder.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[8,51] cannot access jdplus.toolkit.desktop.plugin.ui.properties.FileLoaderFileFilter
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/ui/properties/FileLoaderFileFilter.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileConfiguration.java:[4,36] cannot access jdplus.toolkit.base.tsp.util.PropertyHandler
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/util/PropertyHandler.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileConfiguration.java:[6,42] cannot access jdplus.toolkit.desktop.plugin.util.Persistence
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/util/Persistence.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[22,37] cannot access jdplus.toolkit.desktop.plugin.Config
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/Config.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[23,37] cannot access jdplus.toolkit.desktop.plugin.Persistable
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/Persistable.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[25,45] cannot access jdplus.toolkit.desktop.plugin.actions.Configurable
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/actions/Configurable.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[26,48] cannot access jdplus.toolkit.desktop.plugin.properties.PropertySheetDialogBuilder
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/properties/PropertySheetDialogBuilder.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[27,49] cannot access jdplus.toolkit.desktop.plugin.tsproviders.DataSourceProviderBuddy
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/DataSourceProviderBuddy.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[8,49] cannot access jdplus.toolkit.desktop.plugin.tsproviders.TsProviderProperties
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/TsProviderProperties.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[23,42] cannot access jdplus.toolkit.base.api.timeseries.TsMoniker
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-api/3.7.1/jdplus-toolkit-base-api-3.7.1.jar(/jdplus/toolkit/base/api/timeseries/TsMoniker.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[24,31] cannot access jdplus.toolkit.base.tsp.DataSet
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/DataSet.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[25,31] cannot access jdplus.toolkit.base.tsp.DataSource
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/DataSource.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[12,45] cannot access jdplus.toolkit.desktop.plugin.actions.AbilityNodeAction
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/actions/AbilityNodeAction.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[13,45] cannot access jdplus.toolkit.desktop.plugin.actions.Actions
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/actions/Actions.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[29,56] cannot access jdplus.toolkit.desktop.plugin.tsproviders.TsProviderNodes
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/TsProviderNodes.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[12,34] cannot access jdplus.main.desktop.design.SwingAction
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-main-desktop-design/3.7.1/jdplus-main-desktop-design-3.7.1.jar(/jdplus/main/desktop/design/SwingAction.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[13,34] cannot access jdplus.main.desktop.design.SwingComponent
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-main-desktop-design/3.7.1/jdplus-main-desktop-design-3.7.1.jar(/jdplus/main/desktop/design/SwingComponent.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[14,34] cannot access jdplus.main.desktop.design.SwingProperty
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-main-desktop-design/3.7.1/jdplus-main-desktop-design-3.7.1.jar(/jdplus/main/desktop/design/SwingProperty.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[17,37] cannot access jdplus.toolkit.desktop.plugin.ColorSchemeManager
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/ColorSchemeManager.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[19,48] cannot access jdplus.toolkit.desktop.plugin.concurrent.DefaultThreadFactory
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/concurrent/DefaultThreadFactory.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[20,49] cannot access jdplus.toolkit.desktop.plugin.tsproviders.DataSourceManager
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/tsproviders/DataSourceManager.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[295,55] cannot access jdplus.toolkit.desktop.plugin.util.ListTableModel
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-desktop-plugin/3.7.1/jdplus-toolkit-desktop-plugin-3.7.1.jar(/jdplus/toolkit/desktop/plugin/util/ListTableModel.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[4,31] cannot access jdplus.toolkit.base.tsp.DataSourceProvider
[ERROR]   bad class file: /home/runner/.m2/repository/eu/europa/ec/joinup/sat/jdplus-toolkit-base-tsp/3.7.1/jdplus-toolkit-base-tsp-3.7.1.jar(/jdplus/toolkit/base/tsp/DataSourceProvider.class)
[ERROR]     class file has wrong version 65.0, should be 61.0
[ERROR]     Please remove or make sure it appears in the correct subdirectory of the classpath.
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[18,62] cannot find symbol
[ERROR]   symbol:   class ShortLivedCache
[ERROR]   location: class internal.sdmx.desktop.plugin.Caches
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxCommand.java:[31,19] cannot find symbol
[ERROR]   symbol:   class Builder
[ERROR]   location: class internal.sdmx.desktop.plugin.SdmxCommand
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxWebSourceService.java:[35,52] cannot find symbol
[ERROR]   symbol: class AutoCompletionSpi
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[38,54] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[38,20] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[60,55] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileBeanSupport.java:[60,20] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileConfiguration.java:[100,18] cannot find symbol
[ERROR]   symbol:   class Persistence
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileConfiguration
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[42,53] cannot find symbol
[ERROR]   symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[42,78] cannot find symbol
[ERROR]   symbol: class Configurable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[42,92] cannot find symbol
[ERROR]   symbol: class Persistable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[86,28] cannot find symbol
[ERROR]   symbol:   class Config
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[91,43] cannot find symbol
[ERROR]   symbol:   class Config
[ERROR]   location: class jdplus.sdmx.desktop.plugin.file.SdmxFileProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[42,54] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[42,20] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[69,55] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[69,20] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[97,53] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebBeanSupport.java:[97,20] cannot find symbol
[ERROR]   symbol:   class NodePropertySetBuilder
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebBeanSupport
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebConfiguration.java:[203,18] cannot find symbol
[ERROR]   symbol:   class Persistence
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebConfiguration
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[54,52] cannot find symbol
[ERROR]   symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[54,77] cannot find symbol
[ERROR]   symbol: class Configurable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[54,91] cannot find symbol
[ERROR]   symbol: class Persistable
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[84,48] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[101,48] cannot find symbol
[ERROR]   symbol:   class TsMoniker
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[135,28] cannot find symbol
[ERROR]   symbol:   class Config
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[140,43] cannot find symbol
[ERROR]   symbol:   class Config
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.SdmxWebProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[29,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[30,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[39,46] cannot find symbol
[ERROR]   symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[90,57] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSetAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[27,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[33,49] cannot find symbol
[ERROR]   symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[33,67] cannot find symbol
[ERROR]   symbol: class DataSource
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[48,41] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSourceAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[70,37] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSourceAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[80,57] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.CopyPathSourceAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[49,2] cannot find symbol
[ERROR]   symbol: class SwingComponent
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[19,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[25,46] cannot find symbol
[ERROR]   symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[25,64] cannot find symbol
[ERROR]   symbol: class DataSourceProvider
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[39,41] cannot find symbol
[ERROR]   symbol:   class DataSourceProvider
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.ListSourcesAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[63,37] cannot find symbol
[ERROR]   symbol:   class DataSourceProvider
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.ListSourcesAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[24,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[30,46] cannot find symbol
[ERROR]   symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[30,64] cannot find symbol
[ERROR]   symbol: class DataSource
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[44,41] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[55,37] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[60,35] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[67,61] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenMonitorAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[24,1] static import only from classes and interfaces
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[30,46] cannot find symbol
[ERROR]   symbol: class AbilityNodeAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[30,64] cannot find symbol
[ERROR]   symbol: class DataSource
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[44,41] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[55,37] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[60,28] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[67,54] cannot find symbol
[ERROR]   symbol:   class DataSource
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.OpenWebsiteAction
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/file/SdmxFileProviderBuddy.java:[41,18] cannot find symbol
[ERROR]   symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/SdmxWebProviderBuddy.java:[53,18] cannot find symbol
[ERROR]   symbol: class DataSourceProviderBuddy
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[36,33] cannot find symbol
[ERROR]   symbol: variable COLLECTION_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSetAction.java:[37,33] cannot find symbol
[ERROR]   symbol: variable SERIES_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/CopyPathSourceAction.java:[32,25] cannot find symbol
[ERROR]   symbol: variable SOURCE_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[52,6] cannot find symbol
[ERROR]   symbol:   class SwingAction
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[55,6] cannot find symbol
[ERROR]   symbol:   class SwingAction
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[58,6] cannot find symbol
[ERROR]   symbol:   class SwingAction
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[61,6] cannot find symbol
[ERROR]   symbol:   class SwingProperty
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/JSdmxWebSourcePanel.java:[74,6] cannot find symbol
[ERROR]   symbol:   class SwingProperty
[ERROR]   location: class jdplus.sdmx.desktop.plugin.web.actions.JSdmxWebSourcePanel
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/ListSourcesAction.java:[24,25] cannot find symbol
[ERROR]   symbol: variable PROVIDER_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenMonitorAction.java:[29,25] cannot find symbol
[ERROR]   symbol: variable SOURCE_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/jdplus/sdmx/desktop/plugin/web/actions/OpenWebsiteAction.java:[29,25] cannot find symbol
[ERROR]   symbol: variable SOURCE_ACTION_PATH
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/Caches.java:[104,32] cannot find symbol
[ERROR]   symbol:   variable ShortLivedCachingLoader
[ERROR]   location: class internal.sdmx.desktop.plugin.Caches
[ERROR] /tmp/project13737076715999830498/jdplus-sdmx-desktop/jdplus-sdmx-desktop-plugin/src/main/java/internal/sdmx/desktop/plugin/SdmxAutoCompletion.java:[55,16] constructor WebSourceCompletion in class internal.sdmx.desktop.plugin.SdmxAutoCompletion.WebSourceCompletion cannot be applied to given types;
[ERROR]   required: no arguments
[ERROR]   found:    @lombok.NonNull jdplus.sdmx.base.api.web.SdmxWebProvider
[ERROR]   reason: actual and formal argument lists differ in length
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :jdplus-sdmx-base-api
```
</details>
<details><summary>jdplus-nowcasting @ v2.0.0 -> v3.7.1</summary>

```
[ERROR] COMPILATION ERROR : 
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-api/src/main/java/module-info.java:[25,33] module not found: jdplus.toolkit.base.api
[ERROR] COMPILATION ERROR : 
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-core/src/main/java/module-info.java:[26,44] module not found: jdplus.toolkit.base.core
[ERROR] COMPILATION ERROR : 
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-r/src/main/java/module-info.java:[26,33] module not found: jdplus.toolkit.base.api
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-r/src/main/java/module-info.java:[27,33] module not found: jdplus.toolkit.base.core
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-r/src/main/java/module-info.java:[28,33] module not found: jdplus.toolkit.base.r
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project jdplus-dfm-base-api: Compilation failure
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-api/src/main/java/module-info.java:[25,33] module not found: jdplus.toolkit.base.api
[ERROR] -> [Help 1]
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project jdplus-dfm-base-core: Compilation failure
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-core/src/main/java/module-info.java:[26,44] module not found: jdplus.toolkit.base.core
[ERROR] -> [Help 1]
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project jdplus-dfm-base-r: Compilation failure: Compilation failure: 
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-r/src/main/java/module-info.java:[26,33] module not found: jdplus.toolkit.base.api
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-r/src/main/java/module-info.java:[27,33] module not found: jdplus.toolkit.base.core
[ERROR] /tmp/project8017383672290388319/jdplus-nowcasting-base/jdplus-dfm-base-parent/jdplus-dfm-base-r/src/main/java/module-info.java:[28,33] module not found: jdplus.toolkit.base.r
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
[ERROR] 
[ERROR] After correcting the problems, you can resume the build with the command
[ERROR]   mvn <args> -rf :jdplus-dfm-base-api
```
</details>
