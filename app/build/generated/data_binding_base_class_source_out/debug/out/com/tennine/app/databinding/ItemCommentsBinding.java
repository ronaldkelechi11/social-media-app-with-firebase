// Generated by data binding compiler. Do not edit!
package com.tennine.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tennine.app.R;
import com.tennine.app.model.CommentsModel;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCommentsBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView ivUserProfile;

  @NonNull
  public final AppCompatTextView tvComment;

  @NonNull
  public final AppCompatTextView tvDate;

  @NonNull
  public final AppCompatTextView tvUsername;

  @Bindable
  protected CommentsModel mModel;

  @Bindable
  protected int mPosition;

  protected ItemCommentsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView ivUserProfile, AppCompatTextView tvComment, AppCompatTextView tvDate,
      AppCompatTextView tvUsername) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivUserProfile = ivUserProfile;
    this.tvComment = tvComment;
    this.tvDate = tvDate;
    this.tvUsername = tvUsername;
  }

  public abstract void setModel(@Nullable CommentsModel model);

  @Nullable
  public CommentsModel getModel() {
    return mModel;
  }

  public abstract void setPosition(int position);

  public int getPosition() {
    return mPosition;
  }

  @NonNull
  public static ItemCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_comments, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCommentsBinding>inflateInternal(inflater, R.layout.item_comments, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_comments, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCommentsBinding>inflateInternal(inflater, R.layout.item_comments, null, false, component);
  }

  public static ItemCommentsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemCommentsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCommentsBinding)bind(component, view, R.layout.item_comments);
  }
}
