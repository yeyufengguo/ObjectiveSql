/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2020 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */
package com.github.braisdom.jds.ast.expr;

import com.github.braisdom.jds.ast.AllFieldsConstructor;
import com.github.braisdom.jds.ast.nodeTypes.NodeWithExpression;
import com.github.braisdom.jds.ast.nodeTypes.NodeWithType;
import com.github.braisdom.jds.ast.observer.ObservableProperty;
import com.github.braisdom.jds.ast.type.ClassOrInterfaceType;
import com.github.braisdom.jds.ast.type.ReferenceType;
import com.github.braisdom.jds.ast.visitor.GenericVisitor;
import com.github.braisdom.jds.ast.visitor.VoidVisitor;
import static com.github.braisdom.jds.utils.Utils.assertNotNull;
import com.github.braisdom.jds.ast.Node;
import com.github.braisdom.jds.ast.visitor.CloneVisitor;
import com.github.braisdom.jds.metamodel.InstanceOfExprMetaModel;
import com.github.braisdom.jds.metamodel.JavaParserMetaModel;
import com.github.braisdom.jds.TokenRange;
import java.util.function.Consumer;
import java.util.Optional;
import com.github.braisdom.jds.ast.Generated;

/**
 * Usage of the instanceof operator.
 * <br>{@code tool instanceof Drill}
 *
 * @author Julio Vilmar Gesser
 */
public class InstanceOfExpr extends Expression implements NodeWithType<InstanceOfExpr, ReferenceType>, NodeWithExpression<InstanceOfExpr> {

    private Expression expression;

    private ReferenceType type;

    public InstanceOfExpr() {
        this(null, new NameExpr(), new ClassOrInterfaceType());
    }

    @AllFieldsConstructor
    public InstanceOfExpr(final Expression expression, final ReferenceType type) {
        this(null, expression, type);
    }

    /**
     * This constructor is used by the parser and is considered private.
     */
    @Generated("com.github.braisdom.jds.generator.core.node.MainConstructorGenerator")
    public InstanceOfExpr(TokenRange tokenRange, Expression expression, ReferenceType type) {
        super(tokenRange);
        setExpression(expression);
        setType(type);
        customInitialization();
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.AcceptGenerator")
    public <R, A> R accept(final GenericVisitor<R, A> v, final A arg) {
        return v.visit(this, arg);
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.AcceptGenerator")
    public <A> void accept(final VoidVisitor<A> v, final A arg) {
        v.visit(this, arg);
    }

    @Generated("com.github.braisdom.jds.generator.core.node.PropertyGenerator")
    public Expression getExpression() {
        return expression;
    }

    @Generated("com.github.braisdom.jds.generator.core.node.PropertyGenerator")
    public ReferenceType getType() {
        return type;
    }

    @Generated("com.github.braisdom.jds.generator.core.node.PropertyGenerator")
    public InstanceOfExpr setExpression(final Expression expression) {
        assertNotNull(expression);
        if (expression == this.expression) {
            return (InstanceOfExpr) this;
        }
        notifyPropertyChange(ObservableProperty.EXPRESSION, this.expression, expression);
        if (this.expression != null)
            this.expression.setParentNode(null);
        this.expression = expression;
        setAsParentNodeOf(expression);
        return this;
    }

    @Generated("com.github.braisdom.jds.generator.core.node.PropertyGenerator")
    public InstanceOfExpr setType(final ReferenceType type) {
        assertNotNull(type);
        if (type == this.type) {
            return (InstanceOfExpr) this;
        }
        notifyPropertyChange(ObservableProperty.TYPE, this.type, type);
        if (this.type != null)
            this.type.setParentNode(null);
        this.type = type;
        setAsParentNodeOf(type);
        return this;
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.RemoveMethodGenerator")
    public boolean remove(Node node) {
        if (node == null)
            return false;
        return super.remove(node);
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.CloneGenerator")
    public InstanceOfExpr clone() {
        return (InstanceOfExpr) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.GetMetaModelGenerator")
    public InstanceOfExprMetaModel getMetaModel() {
        return JavaParserMetaModel.instanceOfExprMetaModel;
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null)
            return false;
        if (node == expression) {
            setExpression((Expression) replacementNode);
            return true;
        }
        if (node == type) {
            setType((ReferenceType) replacementNode);
            return true;
        }
        return super.replace(node, replacementNode);
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.TypeCastingGenerator")
    public boolean isInstanceOfExpr() {
        return true;
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.TypeCastingGenerator")
    public InstanceOfExpr asInstanceOfExpr() {
        return this;
    }

    @Generated("com.github.braisdom.jds.generator.core.node.TypeCastingGenerator")
    public void ifInstanceOfExpr(Consumer<InstanceOfExpr> action) {
        action.accept(this);
    }

    @Override
    @Generated("com.github.braisdom.jds.generator.core.node.TypeCastingGenerator")
    public Optional<InstanceOfExpr> toInstanceOfExpr() {
        return Optional.of(this);
    }
}