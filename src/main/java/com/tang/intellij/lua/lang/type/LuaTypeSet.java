package com.tang.intellij.lua.lang.type;

import com.tang.intellij.lua.comment.psi.LuaDocClassDef;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 类型集合
 * Created by TangZX on 2016/12/4.
 */
public class LuaTypeSet {

    public static LuaTypeSet create() {
        return new LuaTypeSet();
    }

    public static LuaTypeSet create(LuaDocClassDef ... classDefs) {
        LuaTypeSet set = new LuaTypeSet();
        for (LuaDocClassDef def : classDefs) {
            set.types.add(LuaClassType.create(def));
        }
        return set;
    }

    public static LuaTypeSet create(LuaType ... types) {
        LuaTypeSet set = new LuaTypeSet();
        Collections.addAll(set.types, types);
        return set;
    }

    private List<LuaType> types = new ArrayList<>();

    public void addType(LuaDocClassDef classDef) {
        types.add(LuaClassType.create(classDef));
    }

    public List<LuaType> getTypes() {
        return types;
    }

    public LuaType getType(int index) {
        return types.get(index);
    }

    @Nullable
    public LuaType getFirst() {
        if (isEmpty())
            return null;
        return types.get(0);
    }

    public boolean isEmpty() {
        return types.isEmpty();
    }

    public void addType(LuaType type) {
        types.add(type);
    }
}
