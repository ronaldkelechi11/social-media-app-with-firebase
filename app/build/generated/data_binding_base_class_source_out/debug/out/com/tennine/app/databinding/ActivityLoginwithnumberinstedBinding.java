// Generated by view binder compiler. Do not edit!
package com.tennine.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tennine.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginwithnumberinstedBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtPhoneEmail;

  @NonNull
  public final TextView edtSignUp;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView tvforgetpasswordnumber;

  private ActivityLoginwithnumberinstedBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnLogin, @NonNull EditText edtPassword, @NonNull EditText edtPhoneEmail,
      @NonNull TextView edtSignUp, @NonNull TextView textView11, @NonNull TextView textView17,
      @NonNull TextView tvforgetpasswordnumber) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.edtPassword = edtPassword;
    this.edtPhoneEmail = edtPhoneEmail;
    this.edtSignUp = edtSignUp;
    this.textView11 = textView11;
    this.textView17 = textView17;
    this.tvforgetpasswordnumber = tvforgetpasswordnumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginwithnumberinstedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginwithnumberinstedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_loginwithnumberinsted, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginwithnumberinstedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.edtPassword;
      EditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edtPhoneEmail;
      EditText edtPhoneEmail = ViewBindings.findChildViewById(rootView, id);
      if (edtPhoneEmail == null) {
        break missingId;
      }

      id = R.id.edtSignUp;
      TextView edtSignUp = ViewBindings.findChildViewById(rootView, id);
      if (edtSignUp == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.tvforgetpasswordnumber;
      TextView tvforgetpasswordnumber = ViewBindings.findChildViewById(rootView, id);
      if (tvforgetpasswordnumber == null) {
        break missingId;
      }

      return new ActivityLoginwithnumberinstedBinding((ConstraintLayout) rootView, btnLogin,
          edtPassword, edtPhoneEmail, edtSignUp, textView11, textView17, tvforgetpasswordnumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
