package com.gabrielbmoro.popcorn.domain.entity

data class TargetModule(
    val moduleName: String,
    val isFeatureModule: Boolean,
    val internalDependencies: List<String>
) {
    override fun toString(): String {
        return "[Mod $moduleName, " +
                "isFeatureModule $isFeatureModule, " +
                "internalDeps $internalDependencies]"
    }
}