import Ember from 'ember';

const {
  get,
  inject: { service },
  Route
} = Ember

export default Route.extend({
  ajax: Ember.inject.service(),
  model() {
    const url = '/greeting';
    return get(this, 'ajax').request(url);
  }
});
