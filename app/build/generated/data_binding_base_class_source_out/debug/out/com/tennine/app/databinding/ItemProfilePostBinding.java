// Generated by data binding compiler. Do not edit!
package com.tennine.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tennine.app.R;
import com.tennine.app.listener.OnProfilePostListener;
import com.tennine.app.model.PostModel;
import com.tennine.app.utils.SquareImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProfilePostBinding extends ViewDataBinding {
  @NonNull
  public final SquareImageView ivProfilePost;

  @Bindable
  protected PostModel mModel;

  @Bindable
  protected OnProfilePostListener mListener;

  protected ItemProfilePostBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SquareImageView ivProfilePost) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivProfilePost = ivProfilePost;
  }

  public abstract void setModel(@Nullable PostModel model);

  @Nullable
  public PostModel getModel() {
    return mModel;
  }

  public abstract void setListener(@Nullable OnProfilePostListener listener);

  @Nullable
  public OnProfilePostListener getListener() {
    return mListener;
  }

  @NonNull
  public static ItemProfilePostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile_post, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfilePostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProfilePostBinding>inflateInternal(inflater, R.layout.item_profile_post, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProfilePostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile_post, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfilePostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProfilePostBinding>inflateInternal(inflater, R.layout.item_profile_post, null, false, component);
  }

  public static ItemProfilePostBinding bind(@NonNull View view) {
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
  public static ItemProfilePostBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProfilePostBinding)bind(component, view, R.layout.item_profile_post);
  }
}