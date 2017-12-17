/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.psi.impl

import com.intellij.lang.ASTNode
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.tree.IElementType
import com.tang.intellij.lua.psi.LuaExpr
import com.tang.intellij.lua.search.SearchContext
import com.tang.intellij.lua.stubs.LuaExprStubImpl
import com.tang.intellij.lua.ty.Ty

/**
 * 表达式基类
 * Created by TangZX on 2016/12/4.
 */
abstract class LuaExprMixin : LuaExprStubMixin<LuaExprStubImpl<*>>, LuaExpr {

    constructor(stub: LuaExprStubImpl<*>, nodeType: IStubElementType<*, *>) : super(stub, nodeType)

    constructor(node: ASTNode) : super(node)

    constructor(stub: LuaExprStubImpl<*>, nodeType: IElementType, node: ASTNode) : super(stub, nodeType, node)

    override fun guessType(context: SearchContext) = Ty.UNKNOWN
}
