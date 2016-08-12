package org.kotlinnative.translator.llvm.types

class LLVMVoidType() : LLVMType() {

    override val align = 0
    override var size: Int = 0
    override val defaultValue = ""

    override fun mangle() = ""
    override val typename = "void"

    override fun hashCode() =
            typename.hashCode()

}
